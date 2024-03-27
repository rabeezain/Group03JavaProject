package elifnur.week01;

public class Finra {
    /*
    Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but
for numbers which are a multiple of 3,
 print "FIN" instead of the number and for numbers which are a
 multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void main(String[] args) {
        int x = 15;
        if (x > 0 && x <= 30) {

            if (x%3==0 && x%5==0) {
                System.out.println("FINRA");

            } else if (x%5==0){
                System.out.println("RA");
            } else if (x%3==0) {
                System.out.println("FIN");
            }else {
                System.out.println("number is not divide");
            }
            System.out.println("x = " + x);
        }
    }
}
