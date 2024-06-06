package elifnur.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {

    //3️⃣  **String - Remove Duplicates**
    //*Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC*


//
        public static String removeDuplicates(String str) {

            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (str.indexOf(ch) == i) {
                    result += ch;
                }
            }
            return result;
        }

        public static void main(String[] args) {

            String result = removeDuplicates("aaaavbbbbbbvdfw");

            System.out.println(" without duplicates: " + result);
        }


}


