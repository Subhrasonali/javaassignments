package day2assignment;
import java.util.Scanner;
public class travel {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter travel distance (KM): ");
	        double distance = sc.nextDouble();

	        System.out.print("Enter petrol price per liter: ");
	        double petrolPrice = sc.nextDouble();

	        System.out.print("Enter vehicle mileage (KM per liter): ");
	        double mileage = sc.nextDouble();
	        double petrolNeeded = distance / mileage;
	        double totalCost = petrolNeeded * petrolPrice;
	        System.out.println("\n----- TRAVEL EXPENSE -----");
	        System.out.println("Petrol Needed: " + petrolNeeded + " liters");
	        System.out.println("Total Travel Cost: " + totalCost);

	        sc.close();
	    }
	}