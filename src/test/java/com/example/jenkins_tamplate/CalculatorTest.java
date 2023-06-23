package com.example.jenkins_tamplate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void sub() {
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    void multi() {
        assertEquals(10, calculator.multi(2, 5));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(6, 2));
    }
}