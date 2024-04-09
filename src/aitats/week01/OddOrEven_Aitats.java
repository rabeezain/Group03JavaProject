package aitats.week01;

import java.util.Scanner;

public class OddOrEven_Aitats {

    //Write  a method which can identifies given number is even or odd
    //EX:
    //identify(5) ->  "Odd"
    //identify(6) ->  "Even"

    public static String identify(int number) {
        return (number % 2 == 0) ? "Even Number" : "Odd number";
    }

    public static void main(String[] args) {
//We import the Scanner class from java.util package to read user input from the console
        Scanner scanner = new Scanner(System.in);

//We prompt the user to enter a number using System.out.print statement
        System.out.println("Enter a number: ");
//We use the nextInt() method of Scanner to read an integer input from the user.
        int number = scanner.nextInt();
//Then, we call the identify method with the input number to determine whether it's even or odd.
        String result = identify(number);
//Finally, we print the result to the console.
        System.out.println("The number is : " + result);

        scanner.close();

    }
}
