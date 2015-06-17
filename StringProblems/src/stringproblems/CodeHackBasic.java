/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

import java.util.Scanner;

/**
 *
 * @author itse5
 */
public class CodeHackBasic {
    
    
    public void NumberSuitableDataType() throws InterruptedException{
        
        
        
        Scanner in = new Scanner(System.in);
        final double bytefrom = -128,byteto = 127;
        final double shortfrom = -32768,shortto = 32767;
        final double intfrom = Math.pow(-2, 31),intto = Math.pow(2, 32)-1;
        final double longfrom = Math.pow(-2, 63), longto = Math.pow(2, 63)-1;
        
        int limit  = in.nextInt();
        double[] items = new double[limit];

        
        for(int i=0;i<=limit-1;i++){
            items[i] = in.nextDouble();
        }
        
        long start = System.currentTimeMillis();
        
        Thread t = new Thread();
        
        for(int i=0;i<=limit-1;i++){
            t.sleep(2000);
            
            if(items[i] >= shortfrom && items[i] <= shortto){
                System.out.println(items[i] + " can be fitted in:");
                System.out.println("* short\n* int \n* long");
               
            
            }else if (items[i] >= intfrom && items[i] <= intto){
                System.out.println(items[i] + " can be fitted in:");
                System.out.println("* int\n* long");
                
            }else if(items[i] >= longfrom && items[i] <= longto){
                System.out.println(items[i] + " can be fitted in:");
                 System.out.println("* long");
                
            }else{
                System.out.println(items[i]+ " can't be fitted anywhere.");
            }
        }
        long now = System.currentTimeMillis();
        System.out.println(now - start);
        
        
    }
    
}
