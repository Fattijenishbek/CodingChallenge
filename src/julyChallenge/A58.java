package julyChallenge;

import java.util.Scanner;

public class A58 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        if (input1.length() < 5) System.out.println("NO");
        else {
            int h1 = input1.indexOf("h");
            String input = input1.substring(h1);
            System.out.println(input);
            int h = input.indexOf("h");
            int e = input.indexOf("e");
            int l1 = input.indexOf("l");
            int l2 = input.indexOf("l", l1+1 );
            int o = input.indexOf("o");
            if (h > e) {
                while (h > e) {
                    e = input.indexOf("e", e );
                    e++;
                }
            }

            if (e > l1) {
                while (e > l1) {
                    l1 = input.indexOf("l", l1 );
                    System.out.println(l1);
                    l1++;
                }
            }
            System.out.println(l1);

            if (l1 > l2) {
                while (l1 > l2) {
                    l2 = input.indexOf("l", l1 + 1);
                    l2++;
                }
            }
            //System.out.println(l2);

            if (l2 > o) {
                while (l2 > o) {
                    o = input.indexOf("o", o );
                    o++;
                }
            }
            System.out.println(h+" "+e+" "+l1+" "+l2+" "+o);

            if (h < e && e <l1 && l1 < l2 && l2 < o) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
