package elifnur.week6;

public class SumTotal {
    /*
    String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20

     */
    public static int  sum(String  input){
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("sum = " + sum("15 aplle 32 banana 3 milk"));
    }
}
