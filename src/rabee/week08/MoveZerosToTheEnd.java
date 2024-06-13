package rabee.week08;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] array = {1,0,2,0,3,0,4,0};
        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if( array[i] != 0 ){
                result[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array
 (Do Not Use Sort Method)
 Ex: input: {1,0,2,0,3,0,4,0};
 output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
