package org.example.inheritance.multiLevelInheritance.production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Director extends Manager {

    private static final Logger log = LoggerFactory.getLogger(Director.class);
    private int numberOfManagers;
    public Director(String name, String employeeId, double salary, int teamSize, int numberOfManagers){
        super(name, employeeId, salary, teamSize);
        nullCheck("Number of Managers", numberOfManagers);
        this.numberOfManagers = numberOfManagers;
    }

    public int getNumberOfManagers(){ return numberOfManagers;}

    public void approveBudget(double amount){
        System.out.println(getName()+" approved a budget of $"+amount);
        log.info("{} approved a budget of ${}", getName(), amount);
    }

    @Override
    public double calculateSalary(){
       return super.calculateSalary() + (numberOfManagers * 2000);
    }

}
