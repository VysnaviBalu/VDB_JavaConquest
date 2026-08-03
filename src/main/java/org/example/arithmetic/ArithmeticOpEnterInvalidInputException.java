package org.example.arithmetic;

/*
 * Custom exception for invalid input scenarios
 * Enterprise apps use custom exception for meaningful error handling
 */
public class ArithmeticOpEnterInvalidInputException extends Exception{
    // custom exception always extends Exception or Runtime Exception
     public ArithmeticOpEnterInvalidInputException(String message){
         super(message);
     }
}
