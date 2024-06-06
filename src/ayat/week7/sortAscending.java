package ayat.week7;

import java.util.Arrays;

public class sortAscending {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sortA(arr)));
    }

    public static int[] sortA(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    //min = arr[j];

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }
}
