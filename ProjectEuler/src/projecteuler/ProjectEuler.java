/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author itse5
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Q50 call = new Q50();
        
        
        double start = System.currentTimeMillis();
        call.Solution();
        
        double end = System.currentTimeMillis();
        
        System.out.println("Total time elapsed : " +(end-start));
        
        
    }
    
}
