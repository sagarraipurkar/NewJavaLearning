package indroductionJava;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Age");
		Scanner age = new Scanner(System.in);
		int age1 = age.nextInt();
		int age2 = age.nextInt();
		int age3 = age.nextInt();
		
		if (age1>age2 && age1>age3) {
			System.out.println("First Person is older");
		} else if (age2>age1 && age2>age3){
			System.out.println("Second Person is older");
		} else {
			System.out.println("Third Person is older");
		}

	}

}
