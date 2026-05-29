package day4;
import java.util.Scanner;
public class Atm {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int correctPin = 1234;
	        int pin;

	        do {
	            System.out.print("Enter PIN: ");
	            pin = sc.nextInt();

	            if(pin != correctPin)
	                System.out.println("Wrong PIN. Try Again!");
	        } while(pin != correctPin);

	        System.out.println("Access Granted");

	        sc.close();
	    }
	}

