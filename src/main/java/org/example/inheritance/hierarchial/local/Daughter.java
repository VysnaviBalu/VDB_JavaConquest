package org.example.inheritance.hierarchial.local;

public class Daughter extends Father{
    char gender = 'F';


    @Override
    void print(){
        System.out.println("Daughter class");
    }

     @Override
     void favFood(){
         System.out.println("Daughter's fav food is Chicken wings");
    }

    void hobbies(){
        System.out.println("Fav hobby is puzzle building");
    }
}
