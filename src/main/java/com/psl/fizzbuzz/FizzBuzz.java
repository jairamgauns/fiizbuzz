package com.psl.fizzbuzz;

public class FizzBuzz {

    public String buildOutput() {
        StringBuilder result = new StringBuilder();
        for (int i=1; i<=100; i++) {
            result.append(computeValue(i)).append(" ");
        }
        System.out.println(result);
        return result.toString();
    }

    public String computeValue(int i) {
        if(i%15 == 0) {
            return "FizzBuzz";
        } else if(i%3 == 0) {
            return "Fizz";
        }  else if(i%5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
