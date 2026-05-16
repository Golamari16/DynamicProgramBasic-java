import java.util.Scanner;

public class CelsiusToForenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter celsius: ");
        double c=sc.nextDouble();
        double f=(c*(9.0/5.0))+32;
        System.out.println("forenheit value: "+f);
    }
}
