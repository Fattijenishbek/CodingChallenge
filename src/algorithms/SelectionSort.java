package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] array={10,2,0,4,9,3,2};
        for(int i=0; i<array.length; i++){
            int small=array[i];
            for(int j=i; j<array.length; j++){
                if (array[j]<small) {
                    small=array[j];
                    array[j]=array[i];
                    array[i]=small;}
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
