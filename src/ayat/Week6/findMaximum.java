package ayat.Week6;

public class findMaximum {
    public static void main(String[] args) {
        //Write a method that can find the maximum number from an int Array
        //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
        int[] array1={100, 12, 23, 32, 44, 57, 6};
        System.out.println("The maximum number is: " + max(array1));
    }
    public static int max(int[] arr){
        int num1=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(num1<arr[i]){
                num1=arr[i];
            }
            continue;
        }
        return num1;
    }
}
