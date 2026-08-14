package org.example.initial.local;

public class Student {
    private String name;
    private int age;
    private double marks;

    // Constructor which initializes the value
    public Student(String name, int age, double marks){
        this.name = name;
        setAge(age);
        setMarks(marks);
    }

    // Getters Method
    public String getName(){return name;}
    public int getAge(){return age;}
    public double getMarks(){return marks;}

    // Setters Method

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >=0 && age <=18){this.age = age;}
        else{
            System.out.println("Student age should be less than 19");
        }
    }

    public void setMarks(double marks){
        if(marks >=0 && marks <=100){this.marks = marks;}
        else{
            System.out.println("Student marks must be between 0 to 100");
        }
    }

    @Override
    public String toString(){
       return  "Name: " + name+
                ", Age: "+ age+
                ", Marks: "+marks;
    }

    public static void main(String[] args){
        Student std = new Student("Vysh", 16, 120);
        System.out.println(std);
        std.setAge(14);
        std.setMarks(98);
        System.out.println("New Value "+ std);
    }

}
