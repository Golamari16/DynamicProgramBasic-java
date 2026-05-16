import java.util.Scanner;// to import the packages do alt + enter

public class Converter {
    public static void main(String[] args){
        /*forenheit to celsius value
        formula c=(f-32)*(5.0/9) */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the forenheit value");
        double f=sc.nextDouble();
        double c=(f-32)*(5.0/9);
        System.out.println("Celsius value="+ c);

    }
}
