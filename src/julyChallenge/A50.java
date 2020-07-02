package julyChallenge;

import java.util.Scanner;

public class A50 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int result =0;

        if (a%2==0){
            result = (a/2)*b;
        }else if(b%2==0){
            result = (b/2)*a;
        }else result = ((a-1)/2)*b + ((b-1)/2);
        System.out.println(result);
    }
}
