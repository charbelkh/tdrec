/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charbel
 */
public class Parent{
    String firstName = "";
    String lastName ="";
    Object obj;
    
    public void setParent(String firstName , String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    };
    public Parent[] addPerson(Parent[] parentArray,Parent par){
        int parentArrayLen = parentArray.length;
        parentArray[parentArrayLen+1] = par;
      return parentArray;
    };
    public Parent getPerson(int ind,Parent[] parr) throws Exception{
      if(parr.length <= ind){
          throw new Exception();
      }  
      return parr[ind];
    };
//    public Object getParent(){
//        return;
//    };
    
    
}
