package julyChallenge;

import java.util.Scanner;

public class A546 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int cost = Integer.parseInt(input[0]);
        int money = Integer.parseInt(input[1]);
        int piece = Integer.parseInt(input[2]);
        int result =0;
        int sum =0;


        for (int i = 1; i <= piece; i++) {
            sum+=cost*i;
        }
        if(sum-money<=0) System.out.println(0);
        else System.out.println(sum-money);
    }
}
