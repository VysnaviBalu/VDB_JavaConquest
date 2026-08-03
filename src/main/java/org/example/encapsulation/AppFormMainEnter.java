package org.example.encapsulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppFormMainEnter {
    private static final Logger logger = LoggerFactory.getLogger(AppFormMainEnter.class);

    public static void main(String[] args){
       logger.info("AppFormEnter Application is starting...");

       try{
           // Builder pattern - super readable, in plain english
           AppFormEnter vys = new AppFormEnter.Builder()
                   .name("Vysh")
                   .rollNo(1)
                   .build();

           AppForm1Enter vysDetails = new AppForm1Enter.Builder()
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
