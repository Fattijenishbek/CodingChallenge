package neobis;

import java.util.Scanner;

public class Neobis2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();

        int c=0;
        int k=1;
        while (k<num){
            k=k*2;
            c+=1;
        }
        System.out.println(c);
    }
}

//import java.util.Scanner;
//
////public class Neobis5
////{
////    public static void main (String[] argv)
////    {
////        Scanner sc = new Scanner(System.in);
////        int a;
////        a = sc.nextInt();
////        System.out.println((int) Math.ceil(Math.log(a) / Math.log(2)));
////    }
////}