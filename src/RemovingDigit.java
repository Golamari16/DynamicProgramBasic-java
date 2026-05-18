import java.util.Scanner;

public class RemovingDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number :");
        int n=sc.nextInt();
        System.out.println("enter the digit to remove: ");
        int remove=sc.nextInt();
        int result=0;
        int place=1;
        while(n!=0) {
            int digit = n % 10;
            if (digit != remove) {
                result = result + digit * place;
                place = place * 10;
            }
            n = n / 10;
        }
        System.out.println("After rmoving: "+result);
        sc.close();
        }
    }

