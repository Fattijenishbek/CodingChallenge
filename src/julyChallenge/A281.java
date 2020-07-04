package julyChallenge;

import java.util.Scanner;

public class A281 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String l1=input.substring(0,1);
        String result = l1.toUpperCase()+input.substring(1);
        System.out.println(result);
    }
}
