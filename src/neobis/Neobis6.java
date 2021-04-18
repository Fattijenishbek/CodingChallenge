package neobis;

import java.util.Scanner;

public class Neobis6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String sent=scanner.nextLine();
            int swt=1;
            String result="";
            for (int i=0; i<sent.length(); i++){
                if (Character.isLetter(sent.charAt(i)) && swt==1){
                    result=result.concat(String.valueOf(Character.toUpperCase(sent.charAt(i))));
                    swt=0;
                }else if(Character.isLetter(sent.charAt(i)) && swt==0){
                    result=result.concat(String.valueOf(Character.toLowerCase(sent.charAt(i))));
                    swt=1;
                }else result=result.concat(String.valueOf(sent.charAt(i)));
            }
            System.out.println(result);
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String input ;
//
//        while (scanner.hasNext()) {
//            StringBuilder answer = new StringBuilder();
//            input = scanner.nextLine();
//
//            char[] arr = new char[input.length()];
//            for (int i = 0; i < input.length(); i++) {
//                arr[i] = Character.toLowerCase(input.charAt(i));
//            }
//            boolean lettCase = true;
//            for (int i = 0; i < input.length(); i++) {
//                if (Character.isLetter(arr[i])) {
//                    if (lettCase)
//                        arr[i] = Character.toUpperCase(arr[i]);
//                    lettCase = !lettCase;
//                }
//            }
//            System.out.println(arr);
//        }
//    }

}
