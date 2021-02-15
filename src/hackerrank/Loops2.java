package hackerrank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                int result =a;
                for (int k=0; k<=j; k++){
                    int res = (int)Math.round(Math.pow(2,k)*b);
                    result+=res;
                }
                System.out.print(result+" ");
            }System.out.println();
        }
        in.close();
    }
}
