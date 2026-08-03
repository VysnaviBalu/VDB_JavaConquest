package org.example.encapsulation;

import java.util.logging.Logger;

/*
 * Main Entry Point - Separat from Business classes
 * SRP: main only job to run the app
 */

public class AppFormMainProd {
    private static final Logger logger = Logger.getLogger(AppFormMainProd.class.getName());

    public static void main(String[] args){

        try{
            // clean object creation - one line each
           AppFormProd vys = new AppFormProd("Vysh",1);
           AppForm1Prod vysDetails = new AppForm1Prod("Mercy",11,"Computer");

           // toString() automatically called by println
           logger.info(vys.toString());
           logger.info(vysDetails.toString());

           logger.info("Student name : "+vys.getName());
        } catch (IllegalArgumentException e){
            // Validation errors are caught here
            logger.warning("Invalid Data "+e.getMessage());
        }

    }

}
