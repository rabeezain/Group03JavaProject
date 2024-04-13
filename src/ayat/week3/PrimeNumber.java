package ayat.week3;

import java.util.Scanner;

public class PrimeNumber {

    //Write a method that can check if a number is prime or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        input.close();
        primeNumber(num);

    }

    public static void primeNumber(int num) {
        boolean prime = true;
        if (num == 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


    }
}
