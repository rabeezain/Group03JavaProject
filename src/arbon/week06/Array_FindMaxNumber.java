package arbon.week06;

public class Array_FindMaxNumber {
    public static void main(String[] args) {

        int[] array = {99, 12, 245, 23, 32, 6642, 44, 57};

        System.out.println(maxNumber (array));

    }

    public static int maxNumber(int[] arr){

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;

    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */