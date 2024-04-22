package ayat.week4;

import java.util.Arrays;

public class sameLetters {
    public static void main(String[] args) {
        //Write a return method that checks if a string is built out of the same letters as another string.
        //  Ex: same("abc", "cab"); ==> true
        //      same("abc", "abb"); ==> false
        System.out.println("same(\"abc\", \"cab\") = " + same("abc", "cab"));
        System.out.println("same(\"abc\", \"abb\") = " + same("abc", "abb"));

    }
    public static boolean same(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
