package org.example.encapsulation.enterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Immutable Student Entity
 *
 * Enterprise Principles
 * 1. Immutable - Fields are final, no setters
 * 2. Validation - Inputs are validated at the construction
 * 3. Builder pattern - Clean way to create complex objects
 *
 */
public class AppForm {
   private static final Logger logger = LoggerFactory.getLogger(AppForm.class);
   // Final - immutable - thread safe , no accidental changes
    private final String name;
    private final int rollNo;

    // private constructor - only builder can create appform

    private AppForm(Builder builder){
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        logger.info("AppForm created: {}", this);
    }

    public String getName(){ return name;}
    public int getRollNo(){ return rollNo;}

    @Override
    public String toString() {
        return "Student[name: " +name+ " , rollNo: "+rollNo+ " ]";
    }

    /**
     * Builder Pattern - enterprise way to create complex objects!
     * Benefit - readable, flexible, validates before building!
     *
     * Usage:-
     * AppForm vys = new AppForm.Builder()
     *                          .name("Vysh")
     *                          .rollNo(1)
     *                          .build();
     */
    public static class Builder  {

        private String name;
        private int rollNo;

        // Each setter returns Builder - allows changing method
        public Builder name (String name){
            if(name == null || name.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be empty!");
            }
            this.name = name.trim();
            return this;
        }

        public Builder rollNo (int rollNo){
            if(rollNo <=0){
                throw new IllegalArgumentException("Roll Number must be positive!");
            }
            this.rollNo = rollNo;
            return this;
        }

        public AppForm build(){
            return new AppForm(this);
        }
    }
}
