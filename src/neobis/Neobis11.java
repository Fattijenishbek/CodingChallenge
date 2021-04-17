package neobis;

import java.util.Scanner;

public class Neobis11 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
            int num=scanner.nextInt();
            if(num==0 || num<0){
                System.out.println("N["+i+"] = "+1);
            }else System.out.println("N["+i+"] = "+num);
        }
    }
}
