package arbon.week04;

public class T03_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("bbaaccddfferrrrr"));

    }
    public static String removeDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if(!result.contains("" + ch)){
                    result += ""+ch;
                }else
                    break;
            }
        }
        return result;
    }
}
/*
String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */