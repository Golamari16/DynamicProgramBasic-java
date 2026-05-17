import java.util.Scanner;

public class ForFibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int t1=0,t2=1;
        int temp=t1+t2;

        if(n==1)
            System.out.println(t1);
        else if(n==2)
            System.out.print(t1+" "+t2);
        else {
            System.out.print(t1+" "+t2+" ");


            for(int i=3;i<=n;i++) {
                System.out.print(temp+" ");
                t1 = t2;
                t2 = temp;
                temp = t1 + t2;
            }
        }
    }
}
