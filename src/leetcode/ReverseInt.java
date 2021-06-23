package leetcode;

public class ReverseInt {
    public int reverse(int x) {

        int n = Math.abs(x);
        int rev = 0; // reversed number
        int rem;   // remainder

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        if (x<0){
            return 0-rev;
        }else
        return rev;
    }

//    public int reverse(int x) {
//        boolean isPositive = x > 0 ? true: false;
//        x = Math.abs(x);
//        int res = 0;
//        while (x > 0) {
//            if (res > Integer.MAX_VALUE/10) return 0;
//            res = res * 10 + x % 10;
//            x /= 10;
//        }
//        return isPositive? res : -res;
//
//    }

    public static void main(String [] args){
        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse(-1230));
    }
}
