package org.example.inheritance;

public class AnimalMainProd {
    public static void main(String[] args){
        AnimalDogProd dog = new AnimalDogProd("Rex", "Labrador");
        dog.eat("Wet Food");
        dog.walk();
        dog.makeSound();
        dog.fetch("Ball");

        System.out.println(dog);
    }
}
