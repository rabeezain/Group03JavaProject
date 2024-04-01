package rabee.week01;
import java.util.Scanner;
public class Task1_OddOrEven_rabee {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number please:");
        num = input.nextInt();
        identify(num);
    }

    public static void identify(int num){

        if (num % 2 == 0){ System.out.println("Even"); }
        else{ System.out.println("Odd"); }
    }
}
/*
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */
