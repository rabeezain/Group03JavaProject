package elifnur.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    //
    //1️⃣  **String - Frequency of Characters**
    //Write a return method that can find the frequency of characters
    //Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*

    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*
    public static String frequencyOfChars(String str) {
        String result = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {

                result += str.charAt(i) + Integer.toString(count);
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = frequencyOfChars(input);
        System.out.println(result);
    }
}
