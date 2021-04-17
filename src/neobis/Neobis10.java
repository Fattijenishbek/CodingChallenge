package neobis;

import java.util.Scanner;

public class Neobis10 {
    public long fib(long num){
        long n0=0,n1=1,n2 = 0;
        if(num==0)return 0;
        else if(num==1) return 1;
        else if(num>1){
        for(int i=1; i<num; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }}
     return n2;
    }
    public static void main(String [] args){
        Neobis10 neobis10 = new Neobis10();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0; i<n; i++){
            long f=scanner.nextLong();
            System.out.println("Fib("+f+") = "+neobis10.fib(f));
        }
    }
}
