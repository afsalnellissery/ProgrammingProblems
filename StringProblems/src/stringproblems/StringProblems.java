/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import javax.naming.ldap.HasControls;

/**
 *
 * @author itse5
 */
public class StringProblems {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
               Pertmutation call = new Pertmutation();
            String str = "bc";
            System.out.println(str.substring(1, 2));
////   
//        

            long start = System.currentTimeMillis();
            call.permutation("abc");
            long end = System.currentTimeMillis();
        
            System.out.println("total time =" + (end-start));
               
               //call.recursion(10);
        
         }
    
  
        
        
    public String ReverseString(String str){
        
        int len = str.length();
        String rev = "";
        for(int i=len-1; i>= 0 ; i--){
            rev += String.valueOf(str.charAt(i));
            
        }

        return rev;
    }
    
    
    public void ConsumerTest(){
        
        List<Integer> list  =  Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        
        list.forEach(new Consumer<Integer>(){
           
            public void accept(Integer value)
            {
                System.out.println(value);
            }
            
        });
        
        
    }
    
    
    public void CountOfDuplicateString(String word){
        
        Map<String,Integer> map =  new  HashMap<>();
        
        
        for(char c : word.toCharArray()){
            map.put(String.valueOf(c), 0);

        }
        
        
        for(char c : word.toCharArray()){
            map.computeIfPresent(String.valueOf(c),(k,v)->v+1);
        }
        
       for (Map.Entry<String,Integer> entry : map.entrySet()) {
           
           System.out.println((equals(entry.getKey()==" ")) ? "white space" : entry.getKey() +"->" + entry.getValue());

        }
      
    }
         
    
    
}
