package com.psl;

public class LeapYear {

    public Boolean isLeapYear(int i) {
        if(i%400 == 0) {
            return true;
        }else if(i%4==0 && i%100!=0) {
            return true;
        }
        else return false;
    }
}
