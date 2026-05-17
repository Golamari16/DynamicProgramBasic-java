import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch='a';
        switch(ch){
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println('b');
                break;
            case 'c':
                System.out.println('c');
                break;
            default:
                System.out.println("invalid");
        }
    }
}
