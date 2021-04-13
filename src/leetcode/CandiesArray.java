package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CandiesArray {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> li = new ArrayList<>();
            int max =0;
            for(int i=0; i<candies.length; i++){
                max=Math.max(candies[i],max);
            }
            for(int i=0; i<candies.length; i++){
                if(candies[i]+extraCandies>=max){
                    li.add(true);
                }else li.add(false);
            } return li;
        }

    public static void main(String [] args){
        int [] candies ={12,1,12};
        int extraCandies=10;
        CandiesArray candiesArray=new CandiesArray();
        System.out.println(candiesArray.kidsWithCandies(candies, extraCandies));
    }
}
