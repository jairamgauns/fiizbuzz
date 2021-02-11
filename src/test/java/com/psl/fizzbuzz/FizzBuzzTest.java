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
        for(int i=3; i<100;i=i+3) {
            if (i % 3 != 0 && i % 5 != 0) {
                String value = fizzBuzz.computeValue(i);
                Assertions.assertEquals("Fizz", value);
                Assertions.assertNotEquals("Buzz", value);
            }
        }
    }

    @Test
    public void testCanReturnFizzIFDivideByFive () {
        for(int i=5; i<100;i=i+5) {
            if(i%3!=0 && i%5!=0) {
                String value = fizzBuzz.computeValue(i);
                Assertions.assertEquals("Buzz", value);
                Assertions.assertNotEquals("Fizz", value);
            }
        }
    }

    @Test
    public void testCanReturnFizzBuzzIFDivideByFiveAndThree () {
        for(int i=5; i<100;i=i+5) {
            if(i%3!=0 && i%5!=0) {
                String value = fizzBuzz.computeValue(i);
                Assertions.assertEquals("FizzBuzz", value);
            }
        }
    }

    @Test
    public void testReturnNumber () {
        for(int i=1; i<100;i++) {
            if(i%3!=0 && i%5!=0 && i%15!=0) {
                String value = fizzBuzz.computeValue(i);
                Assertions.assertEquals(String.valueOf(i), value);
            }
        }
    }

    @Test
    public void testReturnOutputString () {
        String output = fizzBuzz.buildOutput();
        String[] result = output.split(" ");
        for (int i = 1; i < 100; i++) {
            if(i%3!=0 && i%5!=0 && i%15!=0) {
                Assertions.assertEquals(String.valueOf(i), result[i - 1]);
            }
        }
    }
}
