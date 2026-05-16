import java.util.Scanner;

public class ParkingFeeCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter parking hours: ");
        int hours=sc.nextInt();
        int fee=0;
        if(hours<=2)
            System.out.println("Parking fee is 20");
        else{
            fee = 20 + (hours - 2) * 10;

        }
        if(fee>200)
            fee=200;
            System.out.println("Parking hours: "+hours);
        System.out.println("Parking fee "+fee);
        sc.close();
    }
}
