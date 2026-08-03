package org.example.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Enterprise Level Arithmetic Operations
 *
 * Key enterprise principles applied
 * 1. Single Responsibility - Each file does one thing
 * 2. Separation of Concerns - UI, Logic, validations all separated
 * 3. Custom exceptions - Meaning full error messages
 * 4. Immutable inputs -
 */
public class ArithmeticOperationsEnterprise {

    public static final Logger logger = LoggerFactory.getLogger(ArithmeticOperationsEnterprise.class);

    public static void main(String[] args){
        // Main is thin - just bootstraps and delegates
        ArithmeticOperationsEnterprise app = new ArithmeticOperationsEnterprise();
        app.run();
    }

    public void run(){
        logger.info("Arithmetic Operations Enterprise Starting... ");
        // Separate Concerns - Input Handler handles all user inputs
        ArithmeticOpEnterInputHandler inputHandler = new ArithmeticOpEnterInputHandler();

        try{
            int x = inputHandler.getInteger("Enter a Number.. ");
            int y = inputHandler.getInteger("Enter another Number.. ");

            // Calculator handles all business logic
            ArithmeticOpEnterCalculator calculator = new ArithmeticOpEnterCalculator();
            calculator.performAllOperations(x,y);
        } catch (ArithmeticOpEnterInvalidInputException e){
            logger.error("Input error: {}", e.getMessage());
        } catch(Exception e){
            logger.error("Unexpected Error occured", e);
        } finally {
            // Close scanner in finally — always runs even if exception occurs!
            inputHandler.close();
        }
    }
}
