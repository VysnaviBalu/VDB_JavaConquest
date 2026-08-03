package org.example.encapsulation;

import java.util.logging.Logger;

/*
 * Represents a student application form
 * Contains basic student information
 */
public class AppFormProd {
    public static final Logger logger = Logger.getLogger(AppFormProd.class.getName());

    private final String name;
    private final int rollNo;

    public AppFormProd(String name , int rollNo){
        // Validate the inputs

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        if(rollNo <=0){
           throw new IllegalArgumentException("Roll Number should be Positive!");
        }
        this.name = name.trim();
        this.rollNo = rollNo;

        logger.info("App form created for student: "+name);
    }

    public String getName(){ return name;}
    public int getRollNo() { return rollNo;}

    /*
     * toString() is the standard java way - replaces display()
     * Automatically called by System.out.println(object)
     */

    @Override
    public String toString(){
        return "Student[name = " +name+ ", rollNo = " +rollNo+ "]";
    }
}
