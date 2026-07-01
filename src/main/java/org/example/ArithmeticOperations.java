package org.example;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        System.out.println("Enter another number");
        y = sc.nextInt();
        sc.close();
       // Arithmetic operations
       int added = addNumbers(x,y);
       System.out.println("The sum of two numbers: "+added);

       int difference = subtractNumbers(x,y);
       System.out.println("The difference of two numbers: "+difference);

       int multiply =  multiplyNumbers(x,y);
       System.out.println("The multiplication of two numbers: "+multiply);

       float divide = divideNumbers(x,y);
        System.out.println("The division of two numbers: "+divide);
    }

    public static int addNumbers(int x, int y){
        return x + y;
    }

    public static int subtractNumbers(int x, int y){
        return x-y;
    }

    public static int multiplyNumbers(int x, int y){
        return x * y;
    }

    public static float divideNumbers(int x, int y){
       try{
          return (float) x/y;
       }catch (ArithmeticException e){
           System.out.println("Cannot divide by zero.");
           return 0;
       }
    }
}

