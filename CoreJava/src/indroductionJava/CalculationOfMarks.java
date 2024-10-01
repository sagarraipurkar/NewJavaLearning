package indroductionJava;

import java.util.Scanner;

public class CalculationOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Marks");
		Scanner src = new Scanner(System.in);
		int Marks = src.nextInt();

		if (Marks <= 25) {
			System.out.println("Grade is F");
		} else if (Marks > 25 && Marks <= 45) {
			System.out.println("Grade is E");
		} else if (Marks > 45 && Marks <= 50) {
			System.out.println("Grade is D");
		} else if (Marks > 50 && Marks <= 60) {
			System.out.println("Grade is C");
		} else if (Marks > 60 && Marks <= 80) {
			System.out.println("Grade is B");
		} else if (Marks > 80 && Marks<=100) {
			System.out.println("Grade is A");
		} else {
			System.out.println("Invalid Marks enter");
		}
	}
}
