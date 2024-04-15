package aitats.week02;

public class SwapNumbers {

//Swap two variables` values without using third variable

    public static void main(String[] args) {

    int a = 5;
    int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        //Swap values without using a third variable

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a +", b = " + b);

    }

}
