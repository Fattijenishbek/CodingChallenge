package julyChallenge;

import java.util.Scanner;

public class A231 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int c=0;
        for (int i = 0; i <num ; i++) {
            String chance = input.nextLine();
            String[] arr = chance.split(" ");
            int s=0;
            for (int j = 0; j <3 ; j++) {
                if (arr[j].equals("1")) {s++;}
                else s+=0;
            }
            if (s>1) {c++;}
            else c+=0;
        }
        System.out.println(c);
    }
}
