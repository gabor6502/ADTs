/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Elan Gabor
 */
import java.util.ArrayList;
public class Queue {
    
    private ArrayList list;
    private int length;
    
    public Queue(){
 list =  new ArrayList();
 length = 0;
    }//end constructor
    //NEEDS TESTING
    public void enqueue(Object n){
        if(isEmpty()){
            list.add(n);
            //length++;
        }//end if
        //Try traversing the array backwards to move everything over
        else{
        Object temp;
        Object temp2;
        
        int counter = 0;
        temp = list.get(counter);
        list.add(counter, n); //add new element to begingign of list
        counter++;
        
        while(counter != length){
        
        }//end loop
        
        }//end else
        length++;
    }//end method
    
    public Object dequeue(){
        Object temp = "";
        temp = list.get(length-1);
        list.remove(length-1);
        //try traversing the array backwards to move everything over instead of going forwards
        
        
        return(temp);
    }//end method
    
    public boolean isEmpty(){
        if(length < 0){
            return(true);
        }//end if
        else{
            return(false);
        }//end else
    }//end method
}//end class