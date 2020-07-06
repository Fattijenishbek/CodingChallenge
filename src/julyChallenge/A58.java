package julyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class A58 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str ="helo";
        String input = scanner.nextLine();
        List<String> arr = new ArrayList<>();
        int h = input.indexOf("h");
        String word = input.substring(h);

        for (int i = 0; i <word.length() ; i++) {
            arr.add(word.substring(i,i+1));
        }
        HashSet<String> set = new HashSet<>(arr);
        System.out.println(arr.toString());

        for (int i = 0; i <arr.size() ; i++) {
            if (str.indexOf(arr.get(i))==-1) arr.remove(i);
        }
        System.out.println(arr.toString());

        int count = 0;



        for (int i = 0; i <4 ; i++) {
            if (input.indexOf(str.charAt(i))!=-1) count++;
        }
        if(input.indexOf("l", input.indexOf("l")+1)!=-1) count++;

        if (input.length()>5 && count==5) System.out.println("YES");
        else System.out.println("NO");
    }
}
