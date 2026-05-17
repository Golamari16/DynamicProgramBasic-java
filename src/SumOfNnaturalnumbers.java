import java.util.Scanner;

public class SumOfNnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        /*formula
        n*(n+1)/2     */
        for(int i=1;i<=n;i++)
            sum=sum+i;
        System.out.print("sum: " +sum);
        sc.close();
    }
}
