package julyChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class A118 {
    public static void main(String [] args){
        ArrayList<Character> arr = new ArrayList<>();
        String alph = "qwrtpsdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word= word1.toLowerCase();
        for (int i = 0; i <word.length() ; i++) {
            if(alph.indexOf(word.charAt(i))!=-1){
                arr.add(word.charAt(i));
            }
        }
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print("."+arr.get(i));
        }
    }
}
