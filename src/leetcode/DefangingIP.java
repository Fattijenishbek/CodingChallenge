package leetcode;

import java.util.Scanner;

public class DefangingIP {
    public static void main(String[] args) {
        DefangingIP defangingIP = new DefangingIP();
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String result = "";
        System.out.println(defangingIP.defangIPaddr(ip));
    }
    public String defangIPaddr(String address) {
        String result="";
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                System.out.println(i);
                result+="[.]";
            }else result+=Character.toString(address.charAt(i));
        }return  result;
    }
}
