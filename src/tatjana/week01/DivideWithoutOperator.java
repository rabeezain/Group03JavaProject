package tatjana.week01;

import java.util.Scanner;

public class DivideWithoutOperator {
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




