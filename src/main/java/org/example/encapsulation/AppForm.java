package org.example.encapsulation;

public class AppForm {
    private String name;
    private int rollNo;

    public AppForm(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
    public String getName(){ return name;}
    public int getRollNo() {return rollNo;}
    
}

