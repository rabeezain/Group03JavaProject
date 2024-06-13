package rabee.week07;

public class FindMinimum {

    public static void main(String[] args) {

        int[] array = {5, 15, 84, 77, 120, 3};

        minNumber(array);

    }

    public static void minNumber(int array []){

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }



}
/*
Write a method that can find the minimum number from an int Array
 */