import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number :");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
        if(sum==product)
            System.out.println("it is a spy number");
        else
            System.out.println("it is not a spy number");
    }
}
