package day5;
import java.util.Scanner;
public class Studentgrade {
	    public static String getGrade(int marks) {

	        if (marks >= 90) {
	            return "A Grade";
	        } else if (marks >= 75) {
	            return "B Grade";
	        } else if (marks >= 40) {
	            return "C Grade";
	        } else {
	            return "Fail";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Marks: ");
	        int marks = sc.nextInt();

	        System.out.println("Result: " + getGrade(marks));
	        sc.close();
	    }
	}

