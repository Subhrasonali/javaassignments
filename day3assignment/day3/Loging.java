package day3;
import java.util.Scanner;
public class Loging {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String correctUsername = "admin";
	        String correctPassword = "Java@123";

	        int attempts = 0;

	        while (attempts < 3) {

	            System.out.print("Enter username: ");
	            String username = sc.next();

	            System.out.print("Enter password: ");
	            String password = sc.next();

	            if (username.equals(correctUsername)
	                    && password.equals(correctPassword)) {

	                System.out.print("Enter OTP: ");
	                int otp = sc.nextInt();

	                if (otp >= 1000 && otp <= 9999) {
	                    System.out.println("Login Successful");
	                } else {
	                    System.out.println("Invalid OTP");
	                }

	                break;
	            }
	            else {

	                if (username.equals(correctUsername)
	                        && password.startsWith("Java")
	                        && password.endsWith("123")) {

	                    System.out.println("Almost correct password");
	                }
	                else {
	                    System.out.println("Invalid username or password");
	                }

	                attempts++;
	            }
	        }

	        if (attempts == 3) {
	            System.out.println("Account Blocked");
	        }

	        sc.close();
	    }
	}