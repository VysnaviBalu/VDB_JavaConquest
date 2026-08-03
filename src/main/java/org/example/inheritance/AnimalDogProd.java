package org.example.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AnimalDogProd extends AnimalProd {

    private static final Logger logger = LoggerFactory.getLogger(AnimalDogProd.class);
    private final String breed;

     public AnimalDogProd(String name, String breed){
         super(name, 4);
         if(breed == null || breed.isBlank()){
             throw new IllegalArgumentException("Breed cannot be blank!");
         }
         this.breed = breed;
     }

     public void makeSound(){
       logger.info("{} says : Woof%n", getName());
       System.out.printf("%s says Woof%n", getName());
     }

     public void fetch(String item){
       logger.info("{} fetches the item {}", getName(), item);
       System.out.printf("%s fetches the item %s%n", getName(), item);
     }

     public String getBreed() { return breed;}

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', breed='" + breed + "'}";
    }
}
