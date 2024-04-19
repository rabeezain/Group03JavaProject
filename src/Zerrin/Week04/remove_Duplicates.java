package Zerrin.Week04;

import java.util.HashSet;

public class remove_Duplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                result += currentChar;
            }
        }
        System.out.println(result);
    }
}


