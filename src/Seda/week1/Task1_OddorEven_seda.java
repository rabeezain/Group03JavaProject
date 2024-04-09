package Seda.week1;

public class Task1_OddorEven_seda {

    ////umbers -- odd & even
    //        //Write  a method which can identifies given number is even or odd
    //        //EX:
    //        //identify(5) ->  "Odd"
    //        //identify(6) ->  "Even"
    //        // step 1 init.
    public static void main(String[] args) {

        int number = 10;

        if(number%5==0) {
            System.out.println("number is written as even");
        }else {
            System.out.println("number is written as odd");
        }
    }
}
