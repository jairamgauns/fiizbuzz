package com.psl;

public class LeapYear {

    public Boolean isLeapYear(int i) {
        if(i%400 == 0) {
            return true;
        }
        else return false;
    }
}
