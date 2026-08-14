package org.example.inheritance.singleInheritance.enterprise.domain;

import java.util.Objects;

/**
 * Immutable value - safe for any Animal Entity
 *
 * <p> Subclasses are registered via Spring components </p>
 * scan and resolved through Animal services
 */
public abstract class Animal {
    private final String id;
    private final String name;
    private final int numberOfLegs;

    protected Animal(String id, String name, int numberOfLegs){

        this.id = Objects.requireNonNull(id, "id");
        if(name == null || name.trim().isBlank()){ throw new IllegalArgumentException("Name cannot be blank!");}
        if(numberOfLegs < 0){ throw new IllegalArgumentException("Legs is less than 0!");}
        this.name = name.trim();
        this.numberOfLegs = numberOfLegs;
    }
    /* Perform species - specific vocalization */
    public abstract String makeSound();
    public abstract String getSpecies();

    /* General Getters for the declared variables */
    public String getId(){ return id;}
    public String getName(){return name;}
    public int getNumberOfLegs(){return numberOfLegs;}

    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if(!(o instanceof Animal a)) return false;
        return Objects.equals(id, a.id);
    }

    @Override
    public int hashCode(){ return Objects.hash(id);}

    @Override
    public String toString(){
        return String.format("Animal[id=%s, species=%s, name=%s", id, getSpecies(),name);
    }

}
