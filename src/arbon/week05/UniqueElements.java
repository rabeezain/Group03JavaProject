package arbon.week05;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {

        System.out.println(uniqueElements("AWWEERRTTYYUUIIOONNBBVVCXXM"));

    }
    public static String uniqueElements(String str){
        String uniqueElements = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int match = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    match++;
                }
            }
            if (match == 1) {
                uniqueElements += ch;
            }
        }
        return uniqueElements;
    }


}
/*
String - Find the unique
*Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */