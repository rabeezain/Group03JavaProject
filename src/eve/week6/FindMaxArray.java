package eve.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxArray {
    /*
      Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(findMaxNumber(arr));
        System.out.println(findMaxNumber1(arr));

    }

    public static Integer findMaxNumber(int[] array) {
        return Arrays.stream(array).max().orElseThrow();
    }

    public static Integer findMaxNumber1(int[] array) {
        return Collections.max(Arrays.stream(array).boxed().collect(Collectors.toList()));
    }
}
