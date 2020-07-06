package julyChallenge;

import java.util.Scanner;

public class A266 {
    public static void main ( String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sum = 1;

        for (int i = 0; i <num-1 ; i++) {
            if(input.charAt(i)!=input.charAt(i+1)) sum++;
        }
        System.out.println(num-sum);
    }
}
