package ayat.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_consecutive_numbers {
    public static void consecutive(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {
                String result = "";
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
                System.out.println(result);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        input.close();
        consecutive(num);
    }
}
