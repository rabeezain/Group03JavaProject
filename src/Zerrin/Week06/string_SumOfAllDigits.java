package Zerrin.Week06;

public class string_SumOfAllDigits {

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";
        System.out.println("Sum of all digits: "+ CountNum(str));
    }

    public static int CountNum(String input) {
        int result = 0;

        if(input == null || !input.contains(" ")) {
            return result;
        }

        String[] parts = input.split(" ");

        for (String part: parts) {
            if(isNum(part)) {
                result += Integer.parseInt(part);
            }
        }
        return result;
    }

    public static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
