package com.psl.fizzbuzz;

public class FizzBuzz {

    public String printNumbers() {
        String number = "";
        for (int i=1; i<=100; i++) {
            number = number + " " + i;
        }
        return number;
    }
}
