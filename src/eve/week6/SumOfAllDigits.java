package eve.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllDigits {
    /*
    String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
     */

    private static int countSumOfDigits(String str) {

        return Arrays.stream(str.split(" "))
                .filter(p -> Character.isDigit(p.charAt(0)))
                .mapToInt(p -> Integer.parseInt(p))
                .sum();
    }

    public static int sumOfDigits1(String input) {
        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    sum += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }

        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(countSumOfDigits("12 java 5 apple 3"));
        System.out.println(sumOfDigits1("12java5apple3"));


    }
}
