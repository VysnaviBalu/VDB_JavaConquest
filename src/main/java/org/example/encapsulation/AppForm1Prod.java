package org.example.encapsulation;

import java.util.logging.Logger;

/*
 * Represents detailed class information for a student
 * Works with AppFormProd to build student profile
 */
public class AppForm1Prod {
    public static final Logger logger = Logger.getLogger(AppForm1Prod.class.getName());

    private final String homeroomTeacherName;
    private final int standard;
    private final String major;

    /*
     * Creates Class details for a student
     * @param homeroomTeacherName teacher name cannot be null
     * @param standard class standard - must be between 1 and 12
     * @param major subject major - cannot be null
     */
    public AppForm1Prod (String homeroomTeacherName, int standard, String major){
       if(homeroomTeacherName == null || homeroomTeacherName.trim().isEmpty()){
           throw new IllegalArgumentException("Teacher name cannot be null or empty!");
       }
       if(standard < 1 || standard > 12){
           throw new IllegalArgumentException("Standard must be between 1 and 12");
       }
       if(major== null || major.trim().isEmpty()){
           throw new IllegalArgumentException("Major cannot be empty or null");
       }

       this.homeroomTeacherName = homeroomTeacherName.trim();
       this.standard = standard;
       this.major = major.trim();

       logger.info("App form1 created for standard: "+standard);
    }

    public String getHomeroomTeacherName(){ return homeroomTeacherName;}
    public int getStandard(){ return standard;}
    public String getMajor(){ return major;}

    @Override
    public String toString(){
        return "ClassDetails[teacher= "+ homeroomTeacherName +
                " , standard= " + standard +
                " , major= " + major + " ]";
    }

}
