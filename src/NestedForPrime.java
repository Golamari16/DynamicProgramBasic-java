import java.util.Scanner;

public class NestedForPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  2 numbers to check if is it prime number enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }}
            if(flag==true)
                System.out.print(i+" ");

        }

    }
}
