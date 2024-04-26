package ayat.week4;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        //Write a return method that can find the frequency of characters
        //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    public static String frequencyOfChars(String str){

        String result= "";

        for(int i=0; i<str.length()-1; i++){

            char ch = str.charAt(i);
            int frequency=0;

            for(int j =0; j< str.length()-1; j++){
                if(ch==str.charAt(j)){
                    frequency++;
                }
            }
            if(!result.contains(""+ch+frequency))
                result += ""+ch+frequency;
        }

        return result;

    }
}
