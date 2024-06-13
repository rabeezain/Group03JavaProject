package arbon.week06;

import java.util.Arrays;

public class String_SumOfAllDigits {


    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int result = sumOfNumbers(input);
        System.out.println("The sum of all numbers in the string is: " + result);  // Output: 20
    }

    public static int sumOfNumbers(String str) {
        int totalSum = 0;
        String number = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number += ch;
            } else if (!number.isEmpty()) {
                totalSum += Integer.parseInt(number);
                number = "";
            }

        }


        // Add the last number if the string ends with a number
        if (!number.isEmpty()) {
            totalSum += Integer.parseInt(number);
        }

        return totalSum;
    }

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */