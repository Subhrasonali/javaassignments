package day2assignment;
import java.util.Scanner;

public class atm {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter account holder name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter account balance: ");
	        double balance = sc.nextDouble();

	        System.out.print("Enter withdrawal amount: ");
	        double withdrawal = sc.nextDouble();

	        boolean canWithdraw = balance > withdrawal;

	        double remainingBalance = balance - withdrawal;

	        System.out.println("\n----- ATM DETAILS -----");
	        System.out.println("Account Holder: " + name);
	        System.out.println("Balance: " + balance);
	        System.out.println("Withdrawal Amount: " + withdrawal);
	        System.out.println("Balance > Withdrawal : " + canWithdraw);
	        System.out.println("Remaining Balance: " + remainingBalance);

	        sc.close();
	    }
	}