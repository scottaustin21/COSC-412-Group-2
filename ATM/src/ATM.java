import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int customerAccNum = 872455;
        int customerPin = 1234;

        int customerAccts[] = new int[15];


        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("|  Welcome to Powell Bank ATM  |");
        System.out.println("--------------------------------");

        System.out.println("Please enter your account number:\t");
        int userAccNum = in.nextInt();
        System.out.println("Please enter your PIN number:\t");
        int userPinNum = in.nextInt();


    }
}
