package julyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class A236 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String input= scanner.nextLine();
        for (int i = 0; i <input.length() ; i++) {
            list.add(input.substring(i,i+1));
        }
        HashSet<String> unique = new HashSet<>(list);

        if (unique.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
