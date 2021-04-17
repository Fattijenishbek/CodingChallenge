package neobis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Neobis14 {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        int num =scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<num; i++){
            arrayList.add(scanner.nextInt());
        }

        int count=0;
        for(int i=0; i<num-2; i++){
            if(Math.abs(arrayList.get(i)-arrayList.get(i+1))==Math.abs(arrayList.get(i+1)-arrayList.get(i+2))){
                count+=1;
            }else if(Math.abs(arrayList.get(i)-arrayList.get(i+1))!=Math.abs(arrayList.get(i+1)-arrayList.get(i+2))){
                count=0;
            }
            arr.add(count);
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1)+2);
    }
}
