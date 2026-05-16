import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Sum of " + a+","+b +"is " + (a+b));
        System.out.println("Subtraction of " + a+","+b +"is "+ (a-b));
        System.out.println("multiplication of " + a+","+b +"is "+ (a*b));
        System.out.println("division of " + a+","+b +"is "+ (a/b));
        System.out.println("Modulus of "+ a+","+b +"is "+ (a%b));

        }
}
