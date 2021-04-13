package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {
    public  void reverseArray(char[] a) {
        char aux = 0;
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            aux = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = aux;
        }
        System.out.println(a);
    }
    public static void main(String [] args){
        ReverseStringArray reverseStringArray=new ReverseStringArray();
        char [] arr = {'H','e','l','l','o'};
        reverseStringArray.reverseArray(arr);
    }
}
