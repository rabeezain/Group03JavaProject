package eve.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllDigits_String {

    public static void main(String[] args) {

        //System.out.println(sumOfAllDigitsInString("12 java 5 apple 3"));
        System.out.println(sumOfAllDigitsInString2("12 java 5 apple 3"));

    }

    public static int sumOfAllDigitsInString(String str) {
        int sum = 0;

        String[] strArray = str.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(strArray));
        for (String each : list) {
            try {
                sum += Integer.parseInt(each);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }


        }
        return sum;
    }

    public static int sumOfAllDigitsInString2(String str) {
        int sum = 0;

        String[] strArray = str.split(" ");

        for (String each : strArray) {


            try {
                sum += Integer.parseInt(each);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }


        }
        return sum;
    }
}