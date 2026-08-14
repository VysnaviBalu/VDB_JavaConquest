package org.example.inheritance.multiLevelInheritance.production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Employee {

    private static final Logger log = LoggerFactory.getLogger(Employee.class);
    private String name;
    private final String employeeId ;
    private double salary;

    public Employee(String name, String employeeId, double salary){
       nullCheck("Name", name);
       this.name = name;
       nullCheck("Employee ID", employeeId);
       this.employeeId = employeeId;
       nullCheck("Salary", salary);
       this.salary = salary;

    }

    public void work(){
        System.out.println (name+ " is working");
        log.info("{} is working",name);
    }

    public String getName(){return name;}
    public String getEmployeeId(){ return employeeId;}
    public double calculateSalary(){ return salary;}

    public <T> void nullCheck(String label, T value){
        if(value == null || value == "  " || value.toString().trim().isEmpty()){
            throw new IllegalArgumentException(label+ " cannot be empty!");
        }
    }
}
