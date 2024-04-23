package rabee.week02;
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();

        System.out.println("Enter the second number");
        int number2 = input.nextInt();

        swapNumbers(number1, number2);
    }

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("number1 = " + num1 + "\nnumber2 = " + num2);
    }
}
