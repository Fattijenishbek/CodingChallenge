package leetcode;

import java.util.Arrays;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String res = "";
        for(int i=0; i<s.length(); i++){
            res+=s.charAt(findIndex(indices,i));
        }
        return res;
    }

    private int findIndex(int[] arr, int e){
        if(arr==null){
            return -1;
        }
        int le=arr.length;
        int c=0;
        while(c <le){
            if(e==arr[c]){
                return c;
            }else {
                c+=1;
            }
        }return -1;
    }

    public static int findIndex1(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        ShuffleString shuffleString = new ShuffleString();
        int [] re ={9,5,8,0,4,3,6,10,1,2,7};
        String wo="vttqexwqgdc";
        System.out.println(shuffleString.restoreString(wo, re));
    }
}
