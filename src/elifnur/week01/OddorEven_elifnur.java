package elifnur.week01;

import java.util.Scanner;

public class OddorEven_elifnur {
    public static void main(String[] args) {
        System.out.println("hello team");
        //umbers -- odd & even
        //Write  a method which can identifies given number is even or odd
        //EX:
        //identify(5) ->  "Odd"
        //identify(6) ->  "Even"
        // step 1 init.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please could you enter input");
         int x= scan.nextInt();
        // step 2 if statment
        if (x%2==0){
            System.out.println("x is even number ");
        }else {
            System.out.println("x is odd number ");
        }
    }
}
