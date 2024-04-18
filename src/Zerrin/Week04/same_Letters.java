package Zerrin.Week04;

import java.util.Arrays;

public class same_Letters {

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }

    public static boolean same(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}


