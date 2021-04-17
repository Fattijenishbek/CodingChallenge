package neobis;

import java.util.Arrays;
import java.util.Scanner;

public class Neobis6 {
    public String upper(String word){
        String result="";
        for(int i=0; i<word.length();i++){
            if(i%2==0){
                result=result.concat(String.valueOf(Character.toUpperCase(word.charAt(i))));
            }else result=result.concat(String.valueOf(Character.toLowerCase(word.charAt(i))));
        }
        return result;
    }
    public String lower(String word){
        String result="";
        for(int i=0; i<word.length();i++){
            if(i%2==0){
                result=result.concat(String.valueOf(Character.toLowerCase(word.charAt(i))));
            }else result=result.concat(String.valueOf(Character.toUpperCase(word.charAt(i))));
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sent=scanner.nextLine();
        Neobis6 neobis6 = new Neobis6();
        String[] words=sent.split(" ");
        words[0]=neobis6.upper(words[0]);
        for(int i=1; i<words.length; i++){
            if(words[i-1].length()%2==0) {
                words[i] = neobis6.upper(words[i]);
            }
            else if(words[i-1].length()%2!=0) words[i]=neobis6.lower(words[i]);
        }
        System.out.println(Arrays.toString(words).replace("[","").replace("]","").replace(",",""));
    }
}
