package day3;
import java.util.Scanner;
public class Resturant {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int foodChoice;
	        int quantity;
	        double price = 0;

	        System.out.println("1. Veg");
	        System.out.println("2. Non-Veg");

	        System.out.print("Enter main menu choice: ");
	        int mainChoice = sc.nextInt();

	        switch (mainChoice) {

	            case 1:

	                System.out.println("1. Fried Rice - ₹150");
	                System.out.println("2. Noodles - ₹120");

	                System.out.print("Enter food choice: ");
	                foodChoice = sc.nextInt();

	                if (foodChoice == 1) {
	                    price = 150;
	                }
	                else if (foodChoice == 2) {
	                    price = 120;
	                }
	                else {
	                    System.out.println("Invalid Selection");
	                    return;
	                }

	                break;

	            case 2:

	                System.out.println("1. Chicken Biryani - ₹250");
	                System.out.println("2. Grill Chicken - ₹300");

	                System.out.print("Enter food choice: ");
	                foodChoice = sc.nextInt();

	                if (foodChoice == 1) {
	                    price = 250;
	                }
	                else if (foodChoice == 2) {
	                    price = 300;
	                }
	                else {
	                    System.out.println("Invalid Selection");
	                    return;
	                }

	                break;

	            default:
	                System.out.println("Invalid Selection");
	                return;
	        }

	        System.out.print("Enter quantity: ");
	        quantity = sc.nextInt();

	        double total = price * quantity;

	        System.out.print("Enter member status (Gold/Silver/Normal): ");
	        String member = sc.next();

	        if (member.equalsIgnoreCase("Gold")) {
	            total = total - (total * 0.20);
	        }
	        else if (member.equalsIgnoreCase("Silver")) {
	            total = total - (total * 0.10);
	        }

	        System.out.println("Final Bill = ₹" + total);

	        if (total > 2000 && member.equalsIgnoreCase("Gold")) {
	            System.out.println("Free Dessert Available");
	        }

	        sc.close();
	    }
	}

