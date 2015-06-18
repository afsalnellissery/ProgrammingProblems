#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class permutaion:
    def Singlefact(self,num):
        fact =  1;
        for i in range(1, num+1):
            fact = fact * i;
        return fact/num;
    
    def swap(self,n,pos):
        
        a = list(n);
        
        temp = a[pos];
        a[pos]=a[pos-1];a[pos-1]=temp;
        
        return ''.join(a);
        


call =  permutaion();
data = '1234';
a=[];
a.append(data);

len = len(data);
for j in range(0,2):
    for i in  range(len-1,1,-1):
        a.append(call.swap(a[-1],i));
print(a);



    