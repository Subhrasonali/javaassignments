package day2assignment;
import java.util.Scanner;
public class online {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter customer name: ");
	        String customerName = sc.nextLine();

	        System.out.print("Enter product name: ");
	        String productName = sc.nextLine();

	        System.out.print("Enter product price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        double totalBill = price * quantity;

	        System.out.println("\n----- BILL -----");
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Product: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Bill: " + totalBill);

	        sc.close();
	    }
	}

