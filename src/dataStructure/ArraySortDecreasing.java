package dataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDecreasing {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String enter = scanner.nextLine();
        int [] array=new int[n];
        for (int i=0; i<n; i++){
            array[i]=Integer.parseInt(scanner.nextLine().trim());
        }
        for(int i=1; i<n; i++){
            int key=array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
//                System.out.println(Arrays.toString(array) +"     "+key+ " j: "+j);
            }array[j+1]=key;
//            System.out.println("The total point is: "+ Arrays.toString(array)+" j: "+j);

        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("The First largest is "+array[array.length-1]);
//        System.out.println("The Second largest is "+array[array.length-2]);

        System.out.println("Second Largest:"+array[array.length-2]);
        System.out.println("Smallest:"+array[0]);
    }
}
