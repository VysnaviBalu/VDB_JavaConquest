package org.example.polymorphism.local;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(4,5));
        System.out.println(calc.add(2.5,4.9));
        System.out.println(calc.add(1,4,9));
    }
}
