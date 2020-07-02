package julyChallenge;

import java.util.Scanner;

public class A282 {
    public static void main(String [] args){
        char plus = '+';
        char minus = '-';
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i <num ; i++) {
            String input = scanner.nextLine();
            if (input.indexOf(plus)!=-1) sum++;
            else if(input.indexOf(minus)!=-1) sum--;
        }
        System.out.println(sum);
    }
}
