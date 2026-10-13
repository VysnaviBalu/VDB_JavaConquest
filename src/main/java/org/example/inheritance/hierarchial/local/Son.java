package org.example.inheritance.hierarchial.local;

public class Son extends Father {

    @Override
    void print(){
         System.out.println("Son class");
     }
     @Override
     void favFood(){
         System.out.println("Son's favourite food is Cheese burger");
     }
}
