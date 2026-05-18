import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number :");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            n=n/10;
            sum=sum+fact;
        }
        if(sum==temp)
            System.out.println("it is a strong number");
        else
            System.out.println("not a strong number");
    }
}
