
import java.util.Scanner;

public class res {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want reverse");
        int n =sc.nextInt();
        int r ,sum=0;

        while(n>0){
            r=n%10;
            sum=sum*r+r;
            n=n/10;123
        
        }
        System.out.println(sum);
    }
}
