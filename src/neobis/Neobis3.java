package neobis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Neobis3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num, carry;
        num=scanner.nextInt();
        int[][] arr=new int[num][2];
        for(int i=0; i<num; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int i=0; i<num-1;i++){
            for (int j=i+1; j<num; j++){
                if(arr[i][1]<arr[j][1]){
                    carry=arr[j][0];
                    arr[j][0]=arr[i][0];
                    arr[i][0]=carry;
                    carry=arr[j][1];
                    arr[j][1]=arr[i][1];
                    arr[i][1]=carry;
                }else if(arr[i][1]==arr[j][1] && arr[i][0]>arr[j][0]){
                    carry=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=carry;
                }
            }
        }

        for(int i=0; i<num; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num, carry;
//        int [] id;
//        int [] score;
//        num=scanner.nextInt();
//        id=new int[num];
//        score=new int[num];
//        for(int i=0; i<num; i++)
//        {
//            id[i]=scanner.nextInt();
//            score[i]=scanner.nextInt();
//        }
//        for (int i=0; i<num-1; i++)
//            for (int j=i+1; j<num; j++)
//                if (score[i]<score[j])
//                {
//                    carry=score[i];
//                    score[i]=score[j];
//                    score[j]=carry;
//                    carry=id[i];
//                    id[i]=id[j];
//                    id[j]=carry;
//                }else if(score[i]==score[j] && id[i]>id[j]){
//                    carry=id[i];
//                    id[i]=id[j];
//                    id[j]=carry;
//                }
//        for (int i=0; i<num; i++)
//            System.out.println(id[i]+" "+score[i]);
//    }


//    public static void main(String [] args){
//        Scanner scanner = new Scanner(System.in);
//        int num=scanner.nextInt();
//        int a,b;
//        Map<Integer, Integer> sortMap = new HashMap<Integer, Integer>();
//        for(int i=0; i<num;i++){
//            a=scanner.nextInt();
//            b=scanner.nextInt();
//            sortMap.put(a,b);
//        }
//        printMap(sortMap);
//    }
//
//    public static <K, V > void printMap (Map < K, V > map){
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            System.out.println(entry.getKey()
//                    + " " + entry.getValue());
//        }
//    }
}
