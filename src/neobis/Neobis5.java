package neobis;

import java.util.ArrayList;
import java.util.Scanner;

public class Neobis5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ArrayList<Integer> arrlist = new ArrayList<>();

        for(int i=0; i<num; i++){
            arrlist.add(scanner.nextInt());
        }
        int addNum=scanner.nextInt();
        int min=Math.abs(addNum-arrlist.get(0));
        int index=0;
        for(int i=0; i<num; i++){
            int dis=Math.abs(addNum-arrlist.get(i));
            if (dis<min) {
                min=dis;
                index=i;
            }
        }
        System.out.println(arrlist.get(index));
    }
}

