import java.util.Scanner;

public class Biggestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a vale: ");
        int a=sc.nextInt();
        System.out.println("Enter b vale: ");
        int b=sc.nextInt();
        System.out.println("Enter c vale: ");
        int c=sc.nextInt();
        if(a>b &&a>c)
            System.out.println("a is biggest");
        else if(b>c)
            System.out.println("b is biggest");
        else
            System.out.println("c is biggest");


    }
}
