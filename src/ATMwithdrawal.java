import java.util.Scanner;

public class ATMwithdrawal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance in the account: ");
        int balance=sc.nextInt();
        System.out.println("Enter Withdraw amount: ");
        int withdraw=sc.nextInt();
        if(withdraw%100!=0)
            System.out.println("reject");
        else if(withdraw>balance)
            System.out.println("reject");
        else if(withdraw>10000)
            System.out.println("reject");
        else {
            balance=balance-withdraw;
            System.out.println("Withdrawl approved");
            System.out.println("balance is "+balance);
        }


    }
}
