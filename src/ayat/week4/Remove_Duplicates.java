package ayat.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates {
    public static void main(String[] args) {
        //Write a return method that can remove the duplicated values from the String
        //  Ex: removeDup("AAABBBCCC") ==> ABC
        System.out.println(removeDup("AAABBBCCCD"));
    }
    public static String removeDup(String str){
        String result="";
        char[] chars=str.toCharArray();
        Set<Character> unique=new LinkedHashSet<>();


        for (char each : chars)

         {
           unique.add(each);

        }
        for (Character each : unique) {
            result+=""+each;

        }


        return result;
    }


}
