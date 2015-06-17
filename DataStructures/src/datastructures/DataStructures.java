/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import model.Student;

/**
 *
 * @author itse5
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     * 
     */
    
     // generic method printArray                         
 
   
    public static void main(String[] args) {
        
        
        ArrayListDemo call =  new ArrayListDemo();
        
        call.Addstudent();
        
        
//        // Create arrays of Integer, Double and Character
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//
//        Student student = new Student();
//        
//        student.setName("afsl");
//        student.setMobile("001");
//
//        System.out.println( "Array integerArray contains:" );
//        printArray( intArray  ); // pass an Integer array
//
//        System.out.println( "\nArray doubleArray contains:" );
//        printArray( doubleArray ); // pass a Double array
//
//        System.out.println( "\nArray characterArray contains:" );
//        printArray( charArray ); // pass a Character array
    } 
    
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }
   

    
}
