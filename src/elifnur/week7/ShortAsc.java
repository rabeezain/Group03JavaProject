package elifnur.week7;

import java.util.TreeSet;

public class ShortAsc {
    /*
    Question2: Array - Sort Ascending
*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {
        TreeSet<Integer> asc = new TreeSet<Integer>();
        asc.add(10);
        asc.add(8);
        asc.add(9);
        asc.add(7);
        System.out.println("asc = " + asc);
    }
}

