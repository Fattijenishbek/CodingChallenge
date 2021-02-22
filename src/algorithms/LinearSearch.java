package algorithms;

public class LinearSearch {
    public static void main(String[] args){
        int[] array = {5,8,3,1,5,0,7,8};
        int v=5;
        int c=-1;
        for(int i=0; i<array.length; i++){
            if(array[i]==v){
                c=i;
            }break;
        }if(c>-1){
            System.out.println(c);
        }else System.out.println("NIL");
    }
}
