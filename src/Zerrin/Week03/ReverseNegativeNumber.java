package Zerrin.Week03;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
            int result = ReverseNegative(-35);

            System.out.println(result);
        }

        public static int ReverseNegative ( int input){
            String inputText = Integer.toString(input);
            char[] inputCharArr = inputText.toCharArray();

            if (inputCharArr[0] != '-') {
                System.out.println("Wrong input");
                return 0;
            }

            String output = "";

            for (int i = inputCharArr.length - 1; i > 0; i--) {
                output = output + inputCharArr[i];
            }

            return Integer.valueOf("-" + output);
        }
    }
