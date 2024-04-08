package ayat.week2;

import java.util.Scanner;

public class Task1_SwapNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=input.nextInt();
        System.out.println("Enter the second number:");
        int num2=input.nextInt();
        input.close();
        swapNumbers(num1,num2);
    }
    public static void swapNumbers(int num1,int num2){
        num2=num2-num1;
        num1=num1+num2;
        num2=num1-num2;
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
    }
}
