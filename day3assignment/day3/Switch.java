package day3;
import java.util.Scanner;

public class Switch {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Food Menu");
	        System.out.println("1 - Pizza");
	        System.out.println("2 - Burger");
	        System.out.println("3 - Juice");
	        System.out.println("4 - Icecream");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        switch(choice) {

	            case 1:
	                System.out.println("You selected Pizza");
	                break;

	            case 2:
	                System.out.println("You selected Burger");
	                break;

	            case 3:
	                System.out.println("You selected Juice");
	                break;

	            case 4:
	                System.out.println("You selected Icecream");
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();
	    }
	}

