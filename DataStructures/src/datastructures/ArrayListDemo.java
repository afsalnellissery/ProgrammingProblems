/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import model.Student;

/**
 *
 * @author itse5
 */
class ArrayListDemo {
    private ArrayList<String> nameList =  new ArrayList<>();
    
    private LinkedList<Student> Linkedlist = new LinkedList<Student>();

public void Addstudent()
{
    nameList.add("afsal");
    nameList.add("amal");
    
    Iterator itr =  nameList.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    
    for(String item : nameList){
        System.out.println(item);
    }
    
    
    
    
}
}
