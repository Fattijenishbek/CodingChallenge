package competitive;
import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long  n=scanner.nextInt();

        while(true){
            System.out.print(n+" ");
            if (n==1) break;
            if(n%2==0) n=n/2;
            else n=n*3+1;
        }

    }
}
