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
public class Q50 {
    
    
    public void Solution(){
        
        int  prime = 1,sum = 0;
        int ans=2;
        int primeCount=0;
        while (true) {            
            
            prime = GetNextPrime(prime);
           // System.out.println(prime);
            
            if((sum+prime) < 1000000 ){
                sum=sum+prime;
                primeCount++;
               // System.out.println(sum);
            }else{
                break;
            }
            
            if(IsPrime(sum))
                ans = sum;
        }
        System.out.println("prime count :" + primeCount);
        System.out.println("Largest prime sum :" + ans);
        System.out.println("total sum ; " +sum);
    }
    
    
    
    public int GetNextPrime(int prime){
        
        int nextNumber = prime+1;
 
        while(!IsPrime(nextNumber)){
            nextNumber++;
        }
        
        
        return nextNumber;
    }
    
    
    
    public boolean  IsPrime(int prime){
        
        boolean isPrime=true;
        for (int i = 2; i < prime/2; i++) {
            
            if((prime%i)==0)
                isPrime=false;
        }
        
        return isPrime;
    }
    
}
