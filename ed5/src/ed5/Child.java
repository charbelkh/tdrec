/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed5;

/**
 *
 * @author charbel
 */
public class Child extends Parent {

    Parent p1;
    Parent p2;

    public void setChild(String firstName, String lastName, Parent p1, Parent p2) throws Exception {
        if (firstName == null || "".equals(firstName)) {
            throw missingField("first name missing");
        }
        if (lastName == null || "".equals(lastName)) {
            throw missingField("last name missing");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Child[] addPerson(Child[] parentArray, Child par) {
        int parentArrayLen = parentArray.length;
        parentArray[parentArrayLen + 1] = par;
        return parentArray;
    }

    public Child[] removePerson(Child[] parentArray, Child par) {
        Child[] newParentArray;
        newParentArray = new Child[parentArray.length - 1];
        for (int i = 0; i <= parentArray.length; i++) {
            if (!par.equals(parentArray[i])) {
                newParentArray[i] = parentArray[i];
            }
        }
        return parentArray;
    }

    private Exception missingField(String field) {
        throw new UnsupportedOperationException(field); //To change body of generated methods, choose Tools | Templates.
    }

    public Child getPerson(int ind, Child[] parr) throws Exception {
        if (parr.length <= ind) {
            throw new Exception();
        }
        return parr[ind];
    }
}
