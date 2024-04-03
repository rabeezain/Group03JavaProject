package Group3_Tasks;

import java.util.Scanner;

public class numbersOdd_Even {

 public static String result (int number){

     if (number%2==0){
         return "even";
     }else {
         return "odd";
     }
 }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        System.out.println(number + " is " + result(number));
        scanner.close();
    }
}
