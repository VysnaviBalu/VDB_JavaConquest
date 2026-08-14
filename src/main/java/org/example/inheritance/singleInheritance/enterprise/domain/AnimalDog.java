package org.example.inheritance.singleInheritance.enterprise.domain;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;
public class AnimalDog extends Animal {
    public static final String species = "Canis lupus familiaris";

    private String breed;
    private int fetchCount =0;

    public AnimalDog(@NotBlank String name, @NotBlank String breed){
        super(UUID.randomUUID().toString(), name, 4);
        this.breed = breed;
    }

    @Override
    public String makeSound(){
        return "woof";
    }

    @Override
    public String getSpecies(){ return species;}

    public String fetch(String item){
        fetchCount++;
        return String.format("%s fetches the %s !(fetch %d)", getName(), item, fetchCount);
    }

    // General Getters
    public String getBreed(){ return breed;}
    public int getFetchCount(){ return fetchCount;}
}
