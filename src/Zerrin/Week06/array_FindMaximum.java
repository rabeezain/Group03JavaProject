package Zerrin.Week06;

public class array_FindMaximum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57,6};
        int maxNumber = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < maxNumber) {
                maxNumber = num;
            }
        }
        System.out.println("The maximum number is: " + maxNumber);
    }
}

