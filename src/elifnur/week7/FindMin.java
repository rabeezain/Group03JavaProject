package elifnur.week7;

import java.util.TreeSet;

public class FindMin {

    /*
    Question1: Array - Find Minimum
 Write a method that can find the minimum number from an int Array
     */
    public static void main(String[] args) {
        TreeSet<Integer> min = new TreeSet<Integer>();
        min.add(99);
        min.add(12);
       min.add(23);
        min.add(32);
        min.add(44);
        System.out.println(min);
        System.out.println(min.first());


    }
}
