package julyChallenge;

import java.util.Scanner;

public class A96 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int max = 1;

        int count = 1;
        for (int i = 0; i <input.length() -1; i++) {
            if(input.charAt(i)==input.charAt(i+1)) {
                count++;
                if (count>=max) max=count;
            }
            else if(input.charAt(i)!=input.charAt(i+1)){
                if (count>=max) max=count;
                count=1;
            }
        }
        if(max>=7) System.out.println("YES");
        else System.out.println("NO");
    }
}
