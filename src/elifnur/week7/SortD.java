package elifnur.week7;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortD {

    /*
    Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {
        TreeSet<Integer> asc = new TreeSet<Integer>();
        asc.add(90);
        asc.add(20);
        asc.add(10);
        asc.add(8);
        asc.add(7);

        ArrayList<Integer> list = new ArrayList<>(asc);


        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
