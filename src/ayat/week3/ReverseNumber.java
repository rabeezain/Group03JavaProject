package ayat.week3;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int num) {

        int result = 0, reminder = 0;
        num *= -1;
        while (num > 0) {

            reminder = num % 10;
            result = result * 10 + reminder;
            num /= 10;
        }
        return result * -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        input.close();
        System.out.println(reverse(num));
    }
}
