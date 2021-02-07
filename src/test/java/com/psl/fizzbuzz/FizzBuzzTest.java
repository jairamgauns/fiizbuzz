package com.psl.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init () {
        fizzBuzz = new FizzBuzz();
        System.out.println("Initialized Class");
    }

    @Test
    public void testCanReturnFizzIFDivideByThree () {
         String value = fizzBuzz.printNumbers();
        Assertions.assertEquals("Fizz", value);
    }
}