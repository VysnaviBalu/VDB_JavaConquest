package org.example.inheritance.singleInheritance.production;

public class AnimalMain {
    public static void main(String[] args){
        AnimalDog dog = new AnimalDog("Rex", "Labrador");
        dog.eat("Wet Food");
        dog.walk();
        dog.makeSound();
        dog.fetch("Ball");

        System.out.println(dog);
    }
}
