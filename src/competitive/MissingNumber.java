package competitive;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        long sum=n;
        long sum1=0;
        for (long i=1; i<n; i++){
            sum1+=scanner.nextLong();
            sum+=i;
        }
        System.out.println(sum-sum1);
    }
}
