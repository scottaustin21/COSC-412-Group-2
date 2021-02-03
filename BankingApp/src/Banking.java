import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int customerChoice;
        int customerAcctNum;
        int acctNumMaxLength = 2;
        double accountValues[] = new double[100];

        System.out.println(
                "------------------------\n" +
                " Welcome to Powell Bank\n" +
                "------------------------\n");

        System.out.println("Please Swipe Your Card or Enter Your 4-Digit Account Number:");
        while(true){
            try{
                customerAcctNum = myObj.nextInt();
                int length = String.valueOf(customerAcctNum).length();

                while(length > acctNumMaxLength){
                    System.out.println("Invalid Input. Please Enter Only Up to 2-Digits for Your Account Number");
                    customerAcctNum = myObj.nextInt();
                    length = String.valueOf(customerAcctNum).length();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Invalid Input. Please Reenter Your 4-Digit Account Number");
                myObj.next();
            }
        }

        System.out.println(
                "What would you like to do today?:\n" +
                        "[1] -- Check Balance\n" +
                        "[2] -- Withdraw Funds\n" +
                        "[3] -- Make a Deposit\n");

        //error handling for when user enters something other than a number
        while(true){
            try{
                customerChoice = myObj.nextInt();
                break;
            }catch (InputMismatchException e) {
                System.out.println("\t\t-- Invalid Option, Please Input a Number --");
                myObj.next();
            }
        }

        //switch statement determining what task to do
        switch (customerChoice) {
            case 1 -> {
                System.out.println("\tYour account Balance is ____");
            }
            case 2 -> System.out.println("\tHow Much Would You Like to Withdraw?:\n" +
                    "[1] 10\n" +
                    "[2] 20\n" +
                    "[3] 30\n" +
                    "[4] 40\n" +
                    "[5] 50\n");
            case 3 -> {
                System.out.println("\tHow Much Would You Like to Deposit?:\n");
                int custDeposit;
                while (true) {
                    try {
                        custDeposit = myObj.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("\t-- Invalid Deposit Amount, Please Input an\n" +
                                "Amount With No Commas --");
                        myObj.next();
                    }
                }
                System.out.println("Your Amount to be Deposited is: " + custDeposit);
            }
        }

    }

}
