package rabee.week04;

import java.util.Arrays;

public class Task2_SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));

    }

    public static boolean sameLetters(String s1,String s2){
        if( s1.length()!= s2.length()){
            return false;
        }
        char[] chs1=s1.toCharArray();
        char[] chs2=s2.toCharArray();
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        return Arrays.equals(chs1,chs2);
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */