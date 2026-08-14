package org.example.inheritance.multiLevelInheritance.production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Manager extends Employee {

    private static final Logger log = LoggerFactory.getLogger(Manager.class);
    private int teamSize;
    public Manager(String name, String employeeId, double salary, int teamSize){
        super(name, employeeId, salary);
        nullCheck("Team Size", teamSize);
        this.teamSize = teamSize;
    }

    public void conductMeeting(){
        System.out.println(getName()+ " is conducting a team meeting with "+teamSize+ " members ");
        log.info("{} is conducting a team meeting with {} members", getName(), teamSize);
    }

    public  int getTeamSize(){return teamSize;}
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (teamSize * 500);
    }
}
