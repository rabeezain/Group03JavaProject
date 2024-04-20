package arbon.week04;

public class T01_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDDD";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    frequency++;
            }
            if(!result.contains("" + ch + frequency)){
                result += "" + ch + frequency;
            }
        }
        System.out.println(result);
    }
}
/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */