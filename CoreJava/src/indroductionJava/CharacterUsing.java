package indroductionJava;

import java.util.Scanner;

public class CharacterUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;

		Scanner src = new Scanner(System.in);
		number = src.nextInt();
		switch (number % 2) {
		case 0:
			System.out.println("Number is even");
			break;

		case 1:
			System.out.println("Number is odd");
			break;
		}

	}
}
