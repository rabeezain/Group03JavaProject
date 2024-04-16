package tatjana.week02;

public class Divisible {
    public static void main(String[] args) {


        String DivisibleBy15 = "";
        String DivisibleBy5 = "";
        String DivisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                DivisibleBy15 += i + " ";


            } else if (i % 5 == 0) {
                DivisibleBy5 += i + " ";

            } else if (i % 3 == 0) {
                DivisibleBy3 += i + " ";
            }
        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);
    }

}
