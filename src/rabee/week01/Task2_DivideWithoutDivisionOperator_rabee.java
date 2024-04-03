package rabee.week01;
import java.util.Scanner;
public class Task2_DivideWithoutDivisionOperator_rabee {
    public static void main(String[] args) {

        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        num1 = input.nextInt();
        System.out.println("Please enter the second number");
        num2 = input.nextInt();

        System.out.println("result = " + division(num1, num2));
    }
    public static int division(int num1, int num2){

        int result = 0;
        while(num1 >= num2){
            num1 =num2 - num1;
            result++;
        }
        return result;
    }
}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */
