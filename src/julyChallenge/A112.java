package julyChallenge;

import java.util.Scanner;

public class A112 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().toLowerCase();
        String b = scanner.nextLine().toLowerCase();

        if (a.compareTo(b)>0) System.out.println("1");
        else if (a.compareTo(b)<0) System.out.println("-1");
        else System.out.println("0");

    }
}
