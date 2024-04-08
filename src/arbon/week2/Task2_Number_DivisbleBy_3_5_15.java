package arbon.week2;

public class Task2_Number_DivisbleBy_3_5_15 {

    public static void main(String[] args) {

        String DivisibleBy15 = "";
        String DivisibleBy5 = "";
        String DivisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {
            //all the numbers from 1 to 100 that are divided by 15 are also divided by 3 and 5, so it is unnecessary to check for
            //numbers divided by 3 and 5 in first condition
            if (i % 15 == 0) {
                DivisibleBy15 += i + " ";

                //every number that passes the first condition without concatenating,is a number that is not divisible by 15
                // i %15 != 0 will always be true so we don't have to add as a condition
            } else if (i % 5 == 0) {
                DivisibleBy5 += i + " ";

            } else if (i % 3 == 0) {
                DivisibleBy3 += i + " ";
            }
        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
    }
}
/*
Numbers -- Divisible by 3, 5, 15

Write a program that can print the numbers between 1~100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

 */