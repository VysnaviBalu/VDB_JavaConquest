package org.example.inheritance.multiLevelInheritance.production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CompanyMain {
    private static final Logger log = LoggerFactory.getLogger(CompanyMain.class);

    public static void main(String[] args){
        Director director = new Director("Vysh", "123", 750000, 2,5);
        director.work();
        director.conductMeeting();
        director.approveBudget(200000);
        System.out.println(director.getName()+ " salary is " +director.calculateSalary());
    }
}
