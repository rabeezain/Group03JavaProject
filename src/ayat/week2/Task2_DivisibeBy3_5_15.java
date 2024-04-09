package ayat.week2;

import java.util.ArrayList;

public class Task2_DivisibeBy3_5_15 {
    public static void main(String[] args) {
        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                DivisibleBy15.add(i);
            } else if (i % 3 == 0 && i % 15 != 0) {
                DivisibleBy3.add(i);
            } else if (i % 5 == 0 && i % 15 != 0) {
                DivisibleBy5.add(i);
            }
        }
        System.out.print("Divisible By 15 ");
        for (Integer each : DivisibleBy15) {
            System.out.print(each + " ");
        }
        System.out.print("\nDivisible By 5 ");
        for (Integer each : DivisibleBy5) {
            System.out.print(each + " ");
        }
        System.out.print("\nDivisible By 3 ");
        for (Integer each : DivisibleBy3) {
            System.out.print(each + " ");
        }
    }
}
