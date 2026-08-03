package org.example.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Baseclass representing a generic animal
 * Subclasses must provide a species name and leg count
 */
public abstract class AnimalProd {
    private static final Logger logger = LoggerFactory.getLogger(AnimalProd.class);
    private final String  name;
    private final int numberOfLegs;

    public AnimalProd(String name, int numberOfLegs){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be blank!");
        }
        if(numberOfLegs <=0){
            throw new IllegalArgumentException("Number of legs should be <=0");
        }
        this.name = name.trim();
        this.numberOfLegs = numberOfLegs;
    }

    public void eat(String food) {
        logger.info("{} is eating {}", name, food);
        System.out.printf("%s is eating %s%n", name, food);
    }

    public void walk(){
        logger.info("{} is walking on {}", name, numberOfLegs);
        System.out.printf("%s is walking on %d legs %n", name, numberOfLegs);
    }

    // Each subclass must implement its own sound
    public abstract void makeSound();

    public String getName(){return name;}
    public int getNumberOflegs(){ return numberOfLegs;}

    @Override
    public String toString(){
        return "Animal[name = " +name+ " , legs = " +numberOfLegs+ " ]";
    }
}
