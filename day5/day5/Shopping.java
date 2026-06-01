package day5;
import java.util.Scanner;
public class Shopping {

	    public static double calculateFinalBill(double bill, double discount) {
	        double discountAmount = bill * discount / 100;
	        return bill - discountAmount;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Bill Amount: ");
	        double bill = sc.nextDouble();

	        System.out.print("Enter Discount Percentage: ");
	        double discount = sc.nextDouble();

	        double finalBill = calculateFinalBill(bill, discount);

	        System.out.println("Final Bill: " + finalBill);
	        sc.close();
	    }
	}

