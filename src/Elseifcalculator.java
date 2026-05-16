import java.util.Scanner;

public class Elseifcalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=sc.nextInt();
        System.out.println("Enter b value: ");
        int b=sc.nextInt();
        if(a==b)
            System.out.println(a+b);
        else if(a!=b)
            System.out.println(a*b);
        else if(a<0 || b<0)
            System.out.println("invalid input");
    }
}
