package ayat.week1;

import java.util.Scanner;

public class Task1_OddOrEven_ayat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        input.close();
        identify(num);
    }
    public static void identify(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
