package eve.week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMax_Array {
    public static void main(String[] args) {

        int[] arr= {11,2,3,4,55,4,701,2,-2191};

        findMaximum_array(arr);
        findMaximum_arrayCollections(arr);
    }

    public static void findMaximum_array(int[] arr){


        int max= arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max){
                max=arr[i];
            }

        }

        System.out.println(max);

    }




    public static void findMaximum_arrayCollections(int[] arr){

        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(Collections.max(list));
    }

}
