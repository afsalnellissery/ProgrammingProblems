/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author itse5
 */
public class PrimePermutation {
    
    
    public String PermutaionPrime(int start, int end){
        
        
          
        List<Integer> primes = new ArrayList<>();
        String numbers="";
        boolean isGot = false;
        
        
        long pSTime = System.currentTimeMillis();
        primes = PrimeList(start, end);
        long pETime = System.currentTimeMillis();
        
        
        System.out.println("Prime time : " + (pETime-pSTime));
      
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= primes.size()-1; i++) {

            for (int j = i+1; j <= primes.size()-1; j++) {
                if(isPerm(primes.get(i), primes.get(j))){
             
                    int dif =  primes.get(j)-primes.get(i);
           
                    if( primes.contains(primes.get(j)+dif) && isPerm(primes.get(j),primes.get(j)+dif)){
               
                        numbers = primes.get(i) + "" + primes.get(j) + "" + (primes.get(j)+ dif);
                        isGot = true;
                        break;
                    }
                            
                }
                
            }
            
            if(isGot)
                break;
        }

        
       
        
        long endTime = System.currentTimeMillis();
        System.out.println("total time : " + (endTime - startTime));       
        return numbers;
    }
    
    
    
    
    public List<Integer> PrimeList(int start , int end){
        
        List<Integer> primeList = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                
                if((i%j)==0){
                    isPrime =false;
                    break;
                }
                    
                
            }
            if(isPrime==true)
                   primeList.add(i);
            
        }
        
        return primeList;
        
    }
    public int DigitSum(int num){
        int sum=0;
        while(num > 9){
            int d = num % 10;
            num = num /10;
            sum += d;   
        }
        return sum+num;
    }
    
    private boolean isPerm(int m, int n) {
    int[] arr = new int[10];
 
    int temp = n;
    while(temp > 0){
        arr[temp % 10]++;
        temp /= 10;
    }
 
    temp = m;
    while(temp > 0){
        arr[temp % 10]--;
        temp /= 10;
    }
 
    for(int i = 0; i< 10; i++){
        if(arr[i] != 0){
            return false;
        }
    }
    return true;
}
    
    
   
}
