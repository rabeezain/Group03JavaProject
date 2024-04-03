package ayat.week1;

import java.util.Scanner;

public class Task2_DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int num1=input.nextInt();
        System.out.println("Enter the divisor:");
        int num2=input.nextInt();
        input.close();
        System.out.println("The result of division is: " + divide(num1, num2));
    }
    public static int divide(int num1, int num2) {
        int i = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            i++;
        }
        return i;
    }
}
