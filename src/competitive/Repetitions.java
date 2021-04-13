package competitive;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String dna=scanner.nextLine();
        int max=0;
        int c=0;
        for (int i=0; i<dna.length()-1; i++){
            if(dna.charAt(i)== dna.charAt(i+1)) c+=1;
            else c=0;
            if (c>max) max=c;
        }
        System.out.println(max+1);
    }
}
