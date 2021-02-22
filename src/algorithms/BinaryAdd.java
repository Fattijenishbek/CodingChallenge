package algorithms;

import java.util.Arrays;

public class BinaryAdd {
    public static void main(String[] args){
        int a []={1,1,1,1};
        int b []={0,0,0,0};
        int c[]=new int[5];

        int t=0;
        for(int i=a.length-1; i>=0; i--){
            int sum=a[i]+b[i]+t;
            if(sum>1){
                t=1;
                c[i+1]=0;
            }else {c[i+1]=sum;
            t=0;}
        }c[0]=t;
        System.out.println(Arrays.toString(c));
    }
}
