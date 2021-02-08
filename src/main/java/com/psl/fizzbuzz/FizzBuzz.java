package com.psl.fizzbuzz;

public class FizzBuzz {

    public String printNumbers() {
        String number = "";
        for (int i=1; i<=100; i++) {
            number = number + " " + (isFizz(i) ? "Fizz" : i);
        }
        System.out.println(number);
        return number;
    }

    private boolean isFizz(int i) {
        return i%3==0;
    }
}
