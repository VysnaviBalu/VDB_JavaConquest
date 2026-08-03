package org.example.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithmeticOpEnterInputHandler {

    public static final Logger logger = LoggerFactory.getLogger(ArithmeticOpEnterInputHandler.class);

    private final Scanner sc = new Scanner(System.in);
    /*
     * Reads and validates integer input from the user
     * @param prompt message shown to user
     * @return validated integer
     * @throws InvalidInputException if input is not a valid integer
     */

    public int getInteger(String prompt) throws ArithmeticOpEnterInvalidInputException{
        try{
            System.out.println(prompt);
         // validate before reading - Defensive programming
            if(!sc.hasNextInt()){
                throw new ArithmeticOpEnterInvalidInputException("Expected an Integer but got: "+ sc.next());
            }
            return sc.nextInt();
        } catch (InputMismatchException e){
            throw new ArithmeticOpEnterInvalidInputException("Invalid input - Integers only!");
        }
    }

    // Close scanner manually when completely done!
    public void close() {
        sc.close();
    }
}
