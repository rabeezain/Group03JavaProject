package Group3_Tasks;

import java.util.Scanner;

public class numbersDivideWithoutOperator {

    public static int division (int dividend, int divisor){

        if (divisor == 0){
            return 0;
        }

        int result = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int dividend = scanner.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = scanner.nextInt();

        int result = division(dividend, divisor);
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
