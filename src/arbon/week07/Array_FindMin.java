package arbon.week07;

public class Array_FindMin {
    public static void main(String[] args) {

        int[] array = {99, 12, 245, 23, 32, 6642, 44, 57};

        System.out.println(minNum (array));


    }
    public static int minNum(int[] array){

        int min = array [0];
        for(int i = 0; i < array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;


    }
}
