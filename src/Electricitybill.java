import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units: ");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 300) {
            bill = (100 * 2) + ((units - 100) * 5);
        }
        else {

            bill = (100 * 2) + (200 * 5) + ((units - 300) * 10);

        }
        bill = bill + 100;
        if (bill > 2000) {
            bill = bill + (bill * 0.05);
        }
        System.out.println("Electricity bill: " + bill);
        sc.close();
    }
}
