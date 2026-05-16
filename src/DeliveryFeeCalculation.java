import java.util.Scanner;

public class DeliveryFeeCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        int distance=sc.nextInt();
        if(distance<=3)
            System.out.println("Free delivery");
        else if(distance<=6)
            System.out.println(" pay Ruppees "+((distance-3)*12));
        else
            System.out.println(" pay Rupees "+(0+(3)*12+(distance-6)*18));

    }
}
