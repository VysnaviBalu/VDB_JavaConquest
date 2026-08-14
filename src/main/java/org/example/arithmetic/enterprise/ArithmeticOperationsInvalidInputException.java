package org.example.arithmetic.enterprise;

/*
 * Custom exception for invalid input scenarios
 * Enterprise apps use custom exception for meaningful error handling
 */
public class ArithmeticOperationsInvalidInputException extends Exception{
    // custom exception always extends Exception or Runtime Exception
     public ArithmeticOperationsInvalidInputException(String message){
         super(message);
     }
}
