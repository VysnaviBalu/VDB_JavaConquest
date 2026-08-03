package org.example.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Perform all the Arithmetic Operations and log results
 * @param x is the first operand
 * @param y is the second operand
 */
public class ArithmeticOpEnterCalculator {
    public static final Logger logger = LoggerFactory.getLogger(ArithmeticOpEnterCalculator.class);

    public void performAllOperations(int x, int y){
       logger.info("Performing operations on x={} and y={}", x, y);

       logger.info("Sum: {}", add(x,y));
       logger.info("Difference: {}", subtract(x,y));
       logger.info("Product: {}", multiply(x,y));

       // Division handled separately - business rule: no divide by Zero!
       try{
          logger.info("Division: {}", divide(x,y));
       } catch(ArithmeticException e){
           logger.warn("Skipped Division: {}", e.getMessage());
       }
    }

    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    /*
     * Divides x by y
     * @throws Arithmetic exception if y = 0
     */
    public double divide(int x, int y){
        if (y==0){
            throw new ArithmeticException("Cannot divide by 0");
        }
        return (double) x/y;
    }
}
