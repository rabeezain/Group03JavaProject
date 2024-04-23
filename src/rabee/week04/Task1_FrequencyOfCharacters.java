package rabee.week04;

public class Task1_FrequencyOfCharacters {

    public static void main(String[] args) {

        String frequencyOfCharacter = frequencyOfChar("AAABBCDD");
        System.out.println(frequencyOfCharacter);
    }
    public static String frequencyOfChar(String str){

        String result = "";

        for(int i=0; i < str.length(); i++){  //outer loop taking each letters one by one

            char chr = str.charAt(i);
            int frequency=0;

            for(int j =0; j < str.length(); j++){  //inner loop comparing each letters with the all the other letters in String
                if(chr==str.charAt(j)){
                    frequency++;
                }
            }
            if(!result.contains( "" + chr + frequency ))  //repeating char will not add to result repeatedly.
                result += "" + chr + frequency;
        }
        return result;
    }
}
/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */