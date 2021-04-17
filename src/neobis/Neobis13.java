package neobis;

import java.util.Scanner;

public class Neobis13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result=0;
        int c=0;
        int sumTwo=0;
        int degree = 1;
        while(a>0 || b>0 || c>0) {
            sumTwo=0;
            sumTwo=c+(a%10)+(b%10);
            if(sumTwo>7) {
                sumTwo %= 8;
                c=1;
            } else {
                c = 0;
            }
            result += sumTwo*degree;
            degree = degree*10;
            a=a/10;
            b=b/10;
        }
        System.out.println(result);
    }
}
