package julyChallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class A339 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> digit = new ArrayList<>();
        String[] arr = scanner.nextLine().split("\\+");
        if (arr.length==1) System.out.println(arr[0]);
        else {
            String result ="";
            for (int i = 0; i <arr.length ; i++) {
                digit.add(Integer.parseInt(arr[i]));
            }
            Collections.sort(digit);
            for (int i = 0; i < arr.length-1; i++) {
                result += digit.get(i)+"+";
            }
            System.out.println(result+digit.get(digit.size()-1));
        }

    }
}
