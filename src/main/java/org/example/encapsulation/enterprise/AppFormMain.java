package org.example.encapsulation.enterprise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppFormMain {
    private static final Logger logger = LoggerFactory.getLogger(AppFormMain.class);

    public static void main(String[] args){
       logger.info("AppFormEnter Application is starting...");

       try{
           // Builder pattern - super readable, in plain english
           AppForm vys = new AppForm.Builder()
                   .name("Vysh")
                   .rollNo(1)
                   .build();

           AppForm1 vysDetails = new AppForm1.Builder()
                   .homeroomTeacherName("Mercy")
                   .standard(11)
                   .major("Computer Science")
                   .build();
       } catch(IllegalArgumentException e){
           logger.error("Validation failed {}", e.getMessage());
       } catch (Exception e){
           logger.error("Unexpected error", e);
       }
    }
}
