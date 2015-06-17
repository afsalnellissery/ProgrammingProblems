/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author itse5
 */
public class SynchronizedList {
    
    
    public void test(){
        
              List list = Collections.synchronizedList(new ArrayList<Integer>());
        
        list.add(1);
        list.add(2);
        
        synchronized (list){
            
            Iterator  it = list.iterator();
            
            while(it.hasNext()){
                System.out.println(list.get(1));
            }
            
        }
          
    }
    
}
