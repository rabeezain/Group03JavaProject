package tatjana.week03;

public class PrimeNumber {

        public static boolean isPrime(int num) {

            if (num <= 1) {
                return false;
            }

            // Check for divisibility by numbers up to half of num
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int number = 5;
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

