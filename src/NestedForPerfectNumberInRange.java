import java.util.Scanner;

public class NestedForPerfectNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  2 numbers to check if is it perfect number enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int sum=0;
            for(int j=1;j<=(i/2);j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i)
                System.out.print(i+" ");
        }
    }
}
