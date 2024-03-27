package arbon.week01;

import java.util.Scanner;

public class NumbersDivideWithoutOperator_arbon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your dividend number: ");
        int dividend = input.nextInt();

        System.out.println("Enter your divisor number: ");
        int divisor = input.nextInt();

        int quotioent = 0;
        while(dividend>=divisor){
            dividend -= divisor;
            quotioent++;
        }
        System.out.println("Quoetient is " + quotioent + " with remainder " + dividend);
    }
}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */