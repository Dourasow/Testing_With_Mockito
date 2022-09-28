package com.testingPractice;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator calculator = new Calculator();

    @BeforeAll
    static void beforeAll() {
        Calculator calculator = new Calculator();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Run Once after all methods");
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }


    @Test
    void addTwoNumbers() {
        assertEquals(7, calculator.addTwoNumbers(5,2),"The sum of 5 and 2 must be 7");

    }

    @Test
    void multiplyTwoNumbers() {
        assertEquals(10, calculator.multiplyTwoNumbers(5,2),"The product of 5 and 2 must be 10");

    }

    @Test
    void Array1()
    {
        calculator.students.add("Abdul");
        assertEquals(1, calculator.students.size());
    }

    @Test
    void Array2()
    {
        calculator.students.add("Dyabala");
        calculator.students.add("Sow");
        assertEquals(2, calculator.students.size());
    }
}