package arbon.week2;

public class Task3_print_consecutive_numbers {
    public static void main(String[] args) {

        System.out.println(consecutiveNumber(24));

    }

    public static String consecutiveNumber(int number) {
        //we create a String variable to store the data after each iteration is done.
        String result = "";
        for (int i = 1; i <= number; i++) {

            //for every new iteration preResult will be null, and at the end after checking every if statement,
            // what preResult contains will concatenate to result .
            String preResult = "";
            if (i % 2 == 0) {
                preResult += "Coditilty";
            }
            if (i % 3 == 0) {
                preResult += "Test";
            }
            if (i % 5 == 0) {
                preResult += "Coders";
            }
            if (preResult.isEmpty()) {
                preResult += i;
            }
            result += preResult + "\n";

        }
        return result;
    }

}


/*
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
 However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
 If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the
 respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should
 be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 */