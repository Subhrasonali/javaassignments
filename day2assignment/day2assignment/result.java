package day2assignment;
import java.util.Scanner;
public class result {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter student name: ");
	        String studentName = sc.nextLine();

	        System.out.print("Enter marks of Subject 1: ");
	        int sub1 = sc.nextInt();

	        System.out.print("Enter marks of Subject 2: ");
	        int sub2 = sc.nextInt();

	        System.out.print("Enter marks of Subject 3: ");
	        int sub3 = sc.nextInt();

	       
	        int total = sub1 + sub2 + sub3;
	        double average = total / 3.0;

	       
	        System.out.println("\n----- RESULT -----");
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        System.out.println("Average > 50 : " + (average > 50));

	        sc.close();
	    }
	}