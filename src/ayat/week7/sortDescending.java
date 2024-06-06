package ayat.week7;

import java.util.Arrays;

public class sortDescending {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,-80,};
        System.out.println(Arrays.toString(sortD(arr)));


    }

    public static int[] sortD(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int max = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                   // max = arr[j];

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }
}
