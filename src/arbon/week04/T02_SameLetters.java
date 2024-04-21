package arbon.week04;

import java.util.ArrayList;
import java.util.Arrays;

public class T02_SameLetters {
    public static void main(String[] args) {

        System.out.println(same("abc", "cab"));
        System.out.println(same("abc","abb"));

    }

    public static boolean same(String str, String str1) {
        char[] strArray = str.toCharArray();
        char[] str1array = str1.toCharArray();
        Arrays.sort(strArray);
        Arrays.sort(str1array);

        return Arrays.equals(strArray, str1array);
    }
}
/*
 String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */