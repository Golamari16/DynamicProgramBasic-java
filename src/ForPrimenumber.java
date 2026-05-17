import java.util.Scanner;

public class ForPrimenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if is it prime number:");
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                flag=false;
        }
        if(flag==false)
            System.out.println("Not a prime number");
        else
            System.out.println("it is a prime number");
    }
}
