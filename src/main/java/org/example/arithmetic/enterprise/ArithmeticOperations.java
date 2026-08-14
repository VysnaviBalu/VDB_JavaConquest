package org.example.arithmetic.enterprise;

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
public class ArithmeticOperations {

    public static final Logger logger = LoggerFactory.getLogger(ArithmeticOperations.class);

    public static void main(String[] args){
        // Main is thin - just bootstraps and delegates
        ArithmeticOperations app = new ArithmeticOperations();
        app.run();
    }

    public void run(){
        logger.info("Arithmetic Operations Enterprise Starting... ");
        // Separate Concerns - Input Handler handles all user inputs
        ArithmeticOperationsInputHandler inputHandler = new ArithmeticOperationsInputHandler();

        try{
            int x = inputHandler.getInteger("Enter a Number.. ");
            int y = inputHandler.getInteger("Enter another Number.. ");

            // Calculator handles all business logic
            ArithmeticOperationsCalculator calculator = new ArithmeticOperationsCalculator();
            calculator.performAllOperations(x,y);
        } catch (ArithmeticOperationsInvalidInputException e){
            logger.error("Input error: {}", e.getMessage());
        } catch(Exception e){
            logger.error("Unexpected Error occured", e);
        } finally {
            // Close scanner in finally — always runs even if exception occurs!
            inputHandler.close();
        }
    }
}
