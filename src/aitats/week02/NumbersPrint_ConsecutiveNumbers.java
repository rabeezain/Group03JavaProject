package aitats.week02;

public class NumbersPrint_ConsecutiveNumbers {
   //Write a function
   //that,given a positive integer N,prints the consecutive numbers from 1 to N,each on a separate line
   //However,any number divisible by 2,3 or 5 should be replaced by the word Codility,Test or Coders respectively.
   //If a number is divisible by more than one of the number: 2,3 or 5 should be replaced by a concatenation of the respective words Codility,
    //Test and Coders in this three numbers: 2,3 and 5 should be replaced by CodilityTestCodes

    public static void main(String[] args) {


        int N = 24;

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

    }
    }

