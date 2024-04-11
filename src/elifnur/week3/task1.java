package elifnur.week3;

public class task1 {
    public static void main(String[] args) {

        System.out.println("isPrime(24) = " + isPrime(24));

    }
    //Numbers -- PrimeNumber
    //Write a method that can check if a number is prime or not
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;

    }
}
