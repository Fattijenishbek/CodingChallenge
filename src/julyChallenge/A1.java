package julyChallenge;

import java.util.Scanner;

public class A1 {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong((arr[2]));

        if (a%c!=0) a=((a/c)+1)*c;
        if (b%c!=0) b=((b/c)+1)*c;

        long result = (a*b)/(c*c);

        System.out.println(result);
    }
}
