package neobis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Neobis4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<>(num+1);

        for(int i=0; i<num; i++){
            arrlist.add(scanner.nextInt());
        }
        int addNum=scanner.nextInt();
        int addIndex=scanner.nextInt();
        arrlist.add(addIndex-1, addNum);
        System.out.print(arrlist.toString().replace("[","").replace("]","").replace(",",""));
    }
}

//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//        import java.util.Scanner;
//
//public class Neobis5 {
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Integer[] arr = new Integer[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]=scanner.nextInt();
//        }
//
//        int number = scanner.nextInt();
//        int position = scanner.nextInt();
//
//        List<Integer> list = new ArrayList<>(
//                Arrays.asList(arr));
//
//        list.add(position-1, number);
//        arr = list.toArray(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
