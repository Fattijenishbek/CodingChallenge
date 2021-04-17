package neobis;

import java.util.Scanner;

public class Neobis8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();

        int cIn=0;
        int cOut=0;
        for(int i=0; i<num; i++){
            int numIn=scanner.nextInt();
            if(numIn>=10 && numIn<=20) cIn+=1;
            else cOut+=1;
        }
        System.out.println(cIn+" in");
        System.out.println(cOut+" out");
    }
}
