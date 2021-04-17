package neobis;

import java.util.Scanner;

public class Neobis12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[100];
        int m=0;
        int index=0;
        for(int i=0; i<100; i++){
            arr[i]=scanner.nextInt();
            if(arr[i]>m){
                m=arr[i];
                index=i;
            }
        }
        System.out.println(m);
        System.out.println(index+1);
    }
}
