package day2;
import java.util.Scanner;

public class typecasting {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a decimal number:");
	        double num = sc.nextDouble();

	        int whole = (int) num;

	        System.out.println("Whole number is: " + whole);
	        sc.close();
	}
}
