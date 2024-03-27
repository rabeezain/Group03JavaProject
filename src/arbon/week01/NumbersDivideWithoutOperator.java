package arbon.week01;

public class NumbersDivideWithoutOperator {
    public static void main(String[] args) {

        int dividend = 86;
        int divisor = 7;
        int quotioent = 0;

        while(dividend>=divisor){
            dividend -= divisor;
            quotioent++;
        }
        System.out.println("Quoetient is " + quotioent + " with remainder " + dividend);
    }
}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */