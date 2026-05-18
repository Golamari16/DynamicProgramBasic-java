import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number :");
        int n=sc.nextInt();
        int sum=0;
        int temp=n,temp1=n;
        int count=0;
        while(n>0){
            int d=n%10;
            count++;
            n=n/10;
        }
        while(temp>0) {
            int digit = temp % 10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==temp1)
            System.out.println("it a amstrong number");
        else
            System.out.println("not an amstrong number");
    }
}
