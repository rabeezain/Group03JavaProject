package elifnur.week3;

public class task2 {
    //Numbers -- Reverse Negative Number
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        System.out.println("negativeReserveNum(-35) = " + negativeReserveNum(-35));
    }
    public static int negativeReserveNum(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reserve = 0;
        while (n > 0) {
            int lastnm = n % 10;
            reserve = reserve * 10 + lastnm;
            n /= 10;


        }
return  reserve*sign;

    }
}
