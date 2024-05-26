package ayat.Week6;

import java.util.Arrays;

public class SumOfAllDigits {
    //Write a method that can return the sum of the digits in a String
    //Ex:  "12 java 5 apple 10"  ==>  20
    public static void main(String[] args) {

        System.out.println("sum(\"12 java 5 apple 10\") = " + sum("12 java 5 apple 10"));

    }

    public static int sum(String str) {

        String[] splitArray = str.split(" ");

        Integer sumOfAllDigits = 0;
        for (String eachStr : splitArray) {

            char[] eachChar = eachStr.toCharArray();

            if (Character.isDigit(eachChar[0])) {
                Integer num = Integer.valueOf(eachStr);
                sumOfAllDigits += num;
            }


        }
        return sumOfAllDigits;

    }

}
