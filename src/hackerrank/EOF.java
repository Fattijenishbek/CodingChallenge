package hackerrank;

import java.util.Scanner;

public class EOF {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(int i=1; scan.hasNext(); i++){
            System.out.println(i +" "+scan.nextLine());
        }

//        int i =0;
//        while(scan.hasNext()){
//            i++;
//            System.out.println(i+" "+scan.nextLine());
//        }
    }
}
