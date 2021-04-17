package neobis;

import java.util.Scanner;

public class Neobis9 {
    public int result(String num){
        int [] diods = {6,2,5,5,4,5,6,3,7,6};
        int count=0;
        for(int i=0; i<num.length(); i++){
            count+=diods[Character.getNumericValue(num.charAt(i))];
        }return count;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Neobis9 neobis9 = new Neobis9();
        int c = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < c; i++) {
            String num = scanner.nextLine();
            System.out.println(neobis9.result(num)+" leds");
        }
    }
}
