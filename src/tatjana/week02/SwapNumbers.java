package tatjana.week02;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}


