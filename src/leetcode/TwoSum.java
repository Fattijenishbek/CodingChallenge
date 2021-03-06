package leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(target-nums[i]==nums[j])
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String [] args){
        TwoSum twoSum = new TwoSum();
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum.twoSum(arr, 6)));
    }
}
