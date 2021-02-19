package com.psl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

@SpringBootTest
public class LeapYearTest {

    LeapYear leapYear;

    @BeforeEach
    public void init(){
        leapYear = new LeapYear();
    }

    @Test
    public void testYearDivisibleBy400() {
        for(int i=1;i< Calendar.getInstance().get(Calendar.YEAR);i++) {
            if(i%400 == 0) {
                Assertions.assertEquals(Boolean.TRUE, leapYear.isLeapYear(i));
            }
        }
    }

    @Test
    public void testYearDivisibleBy100ButNotBy400() {
        for(int i=1;i< Calendar.getInstance().get(Calendar.YEAR);i++) {
            if(i%100 == 0 && i%400 != 0) {
                Assertions.assertEquals(Boolean.FALSE, leapYear.isLeapYear(i));
            }
        }
    }

    @Test
    public void testYearDivisibleBy4ButNotBy100() {
        for(int i=1;i< Calendar.getInstance().get(Calendar.YEAR);i++) {
            if(i%4 == 0 && i%100 != 0) {
                Assertions.assertEquals(Boolean.TRUE, leapYear.isLeapYear(i));
            }
        }
    }
}
