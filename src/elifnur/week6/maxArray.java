package elifnur.week6;

import java.util.TreeSet;

public class maxArray {

    /*
    Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {
        TreeSet<Integer> max = new TreeSet<Integer>();
        max.add(99);
        max.add(12);
        max.add(23);
        max.add(32);
        max.add(44);
        max.add(57);
        max.add(6);
        System.out.println(max);
        System.out.println(max.last());


    }
}
