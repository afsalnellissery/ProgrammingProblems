# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor. test2

class myclass:
    def isPrime(self, num):
        isPrime = True;
        for i in  range(2,num) : 
            if (num % i) == 0:
                print ('not prime');
                isPrime = False;
                break;

        if isPrime==True :
            print("this number is prime");


call = myclass()
call.isPrime(11);

