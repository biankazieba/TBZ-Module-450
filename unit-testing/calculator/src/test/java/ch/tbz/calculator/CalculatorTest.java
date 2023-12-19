package ch.tbz.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(105.2, calculator.add(26.3, 78.9));
    }

    @Test
    void remove() {
        assertEquals(21, calculator.remove(31, 10));
    }

    @Test
    void multiply() {
        assertEquals(310, calculator.multiply(31, 10));
    }

    @Test
    void divide() {
        assertEquals(5, calculator.divide(25, 5));
    }
}
