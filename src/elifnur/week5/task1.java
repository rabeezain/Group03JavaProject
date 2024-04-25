package elifnur.week5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class task1 {


    //1️⃣  **String - Find the unique**
    //*Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";
    //*
    //2️⃣  **String -- Reverse **
    //*Write a function that can reverse a String
    //Ex: Reverse("ABCD"); ==> DCBA *

    public static void main(String[] args) {


            Set<Character> uniqueCharacters = new HashSet<>();
            String str = "AAABBBCCCDEF";

            for (char c : str.toCharArray()) {
                if (c == 'D' || c == 'E' || c == 'F') {

                    uniqueCharacters.add(c);
                }
            }

            System.out.print("linkhasset = ");
            for (char c : uniqueCharacters) {
                System.out.print(c);
            }
        }
    }

