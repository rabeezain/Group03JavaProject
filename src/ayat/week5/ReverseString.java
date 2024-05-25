package ayat.week5;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Reverse(\"ABCDE\") = " + Reverse("ABCDE"));

    }
    public static String Reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=""+str.charAt(i);

        }

        return result;
    }
}
