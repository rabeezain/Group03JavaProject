package Zerrin.Week02;

public class Swap_Numbers {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        System.out.println("Before: a = " + a + ", b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}
