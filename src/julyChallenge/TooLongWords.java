package julyChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrayList<String> arr =new ArrayList<>();
        int num = input.nextInt();
        String digit="";
        for (int i = 0; i <= num; i++) {
            String word = input.nextLine();
            if (word.length()<=10){
                digit = word;
            }else{
                digit = word.substring(0,1)+ Integer.toString(word.length()-2)+word.substring(word.length()-1);
            }
            arr.add(digit);
        }

        for (int i = 0; i <=num ; i++) {
            System.out.println(arr.get(i));
        }
    }
}
