package tatjana.week03;

public class ReverseNumber {

        public static void main(String[] args) {
            int input = -75;
            int reversed = reverseDigits(input);
            System.out.println("Input: " + input);
            System.out.println("Reversed: " + reversed);
        }

        public static int reverseDigits(int num) {
            int reversedNum = 0;
            while (num != 0) {
                reversedNum = reversedNum * 10 + num % 10;
                num /= 10;
            }
            return reversedNum;
        }
    }
