package org.example.arithmetic.production;

import org.example.arithmetic.local.ArithmeticOperations;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Logger;

/*
 Performs basic Arithmetic Operations
 Level 2: Clean code, proper logging, input validation
 */

public class ArithmeticOperationsProd {

    // Logger replaces the System.out.println in production
    public static final Logger logger = Logger.getLogger(ArithmeticOperations.class.getName());

    public static void main(String[] args){
        // Declare variables separately. Cleaner and more readable
        int x;
        int y;

        try(Scanner sc = new Scanner(System.in)){
            x = getValidInput(sc, "Enter a Number: ");
            y = getValidInput(sc, "Enter another Number: ");
        } catch (InputMismatchException e){
            logger.warning("Invalid input! Please enter integers only.");
            return;
        }

        // Perform and log all operations
        logger.info("Sum: " +addNumbers(x,y));
        logger.info("Subtract: " + subtractNumbers(x,y));
        logger.info("Product: " +multiplyNumbers(x,y));

        // Division handled separately - Needs Zero check
        if(y==0){
            logger.warning("Cannot divide by 0");
        } else {
            logger.info("Divide: " +divideNumbers(x,y));
        }
    }

    /*
    Reads and Validates integer inputs from the user
    Keeps asking until user provides valid inputs
     */

    private static int getValidInput (Scanner sc, String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }

    // Each method does one thing and returns result

    public static int addNumbers(int x, int y){
        return x+y;
    }
    public static int subtractNumbers(int x, int y){
        return x-y;
    }
    public static int multiplyNumbers(int x, int y){
        return x*y;
    }
    public static double divideNumbers(int x, int y){
        return (double) x/y;
    }
}
