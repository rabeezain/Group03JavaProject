package ayat.week5;

public class Unique {
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEFG"));
    }

    public static String unique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency==1)
                result += "" + ch;
        }

        return result;
    }
}
