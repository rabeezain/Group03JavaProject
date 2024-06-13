package rabee.week08;

import java.util.Arrays;

public class NUniqueIntegers {

    public static void main(String[] args) {
        int N = 7;
        int[] result = generateSumZeroArray(N);
        System.out.println(Arrays.toString(result));
    }

    public static int[] generateSumZeroArray(int N) {
        int[] result = new int[N];

        int value = 1;
        for (int i = 0; i < N / 2; i++) {
            result[i] = value;
            result[N - 1 - i] = -value;
            value++;
        }

        // If N is odd, add a zero in the middle
        if (N % 2 != 0) {
            result[N / 2] = 0;
        }

        return result;
    }
}

/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100),
returns an array containing N unique integers that sum up to 0.
The function can return any such array.
For example,
given N = 4,
the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]
(but there are many more correct answers).
 */