package neobis;

import java.util.Scanner;

public class Neobis7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            long pswd=scanner.nextLong();
            if(pswd==2016){
                System.out.println("Access permitted");
                break;
            }else System.out.println("Incorrect password");
        }
    }
}
