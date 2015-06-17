/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

/**
 *
 * @author itse5
 */
public class Pertmutation {
    
    
    public static void permutation(String str) { 
      permutation("", str); 
   }

private static void permutation(String prefix, String str) {
    int n = str.length();
   // System.out.println(" string count=" + n + "string =" + str);
    if (n == 0) System.out.println(prefix);
    else {
        System.out.println("else");
        for (int i = 0; i < n; i++){
            System.out.println("second stage:"+prefix);
            System.out.println("loop i =" +i);
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}


public void recursion(int j){
    
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        recursion(i);
    }
}
    
}
