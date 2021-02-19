package com.psl.leapyear;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeapYearTest {

    LeapYear leapYear;

    @BeforeEach
    public void init(){
        leapYear = new LeapYear();
    }

}
