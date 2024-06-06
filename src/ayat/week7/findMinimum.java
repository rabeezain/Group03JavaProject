package ayat.week7;

public class findMinimum {
    public static void main(String[] args) {
        //Write a method that can find the minimum number from an int Array
        //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
        int[] array1={100, 12, 23, 32, 101, 57, 102};
        System.out.println("The minimum number is: " + min(array1));
    }
    public static int min(int[] arr){
        int num1=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(num1>arr[i]){
                num1=arr[i];
            }
            continue;
        }
        return num1;
    }

}
