package Zerrin.Week05;

import java.util.HashMap;
import java.util.HashSet;

public class findTheUnique {
    public static void main(String[] args) {

        String input = "AAABBBCCCDEF";
        String uniqueChars = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars += currentChar;
            }
        }
        System.out.println("Unique characters: " + uniqueChars);
    }
}