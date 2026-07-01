package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {

    // Add numbers Tests
    @Test
    void shouldAddPositiveNumbers(){
        assertEquals(40,
                ArithmeticOperations.addNumbers(10,30));
    }

    @Test
    void shouldAddNegativeNumbers(){
        assertEquals(-15,
                ArithmeticOperations.addNumbers(-5,-10));
    }

    @Test
    void shouldAddZero(){
        assertEquals(17,
                ArithmeticOperations.addNumbers(0,17));
    }

    // Subtract Numbers Test
    @Test
    void shouldSubtractPositiveNumbers(){
        assertEquals(20,
                ArithmeticOperations.subtractNumbers(30,10));
    }

    @Test
    void shouldSubtractNegativeNumber(){
        assertEquals(3,
                ArithmeticOperations.subtractNumbers(-4,-7));
    }

    @Test
    void shouldSubtractFromNegativeNumber(){
        assertEquals(-11,
                ArithmeticOperations.subtractNumbers(-4,7));
    }

    @Test
    void shouldMultiplyPositiveNumber(){
        assertEquals(28,
                ArithmeticOperations.multiplyNumbers(4,7));
    }

    @Test
    void shouldMultiplyNegativeNumbers(){
        assertEquals(28,
                ArithmeticOperations.multiplyNumbers(-4,-7) );
    }

    @Test
    void shouldMultiplyOneNegativeNumber(){
        assertEquals(-28,
                ArithmeticOperations.multiplyNumbers(-4,7));
    }

    @Test
    void shouldMultiplyZero(){
        assertEquals(0,
                ArithmeticOperations.multiplyNumbers(8,0));
    }


    @Test
    void shouldDivideNumbers() {
        assertEquals(2.5f,
                ArithmeticOperations.divideNumbers(5, 2));
    }

    @Test
    void shouldReturnZeroForDivideByZero() {
        assertEquals(0,
                ArithmeticOperations.divideNumbers(10, 0));
    }
}
