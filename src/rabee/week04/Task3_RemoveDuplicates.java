package rabee.week04;

public class Task3_RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("Result = " + removeDuplicate("AAABBBCCC"));
    }

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i);

            if (result.contains("" + ch)) { continue; }
            else { result += ch; }
        }
        return result;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */