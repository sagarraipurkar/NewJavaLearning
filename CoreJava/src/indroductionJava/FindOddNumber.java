package indroductionJava;

import java.util.Scanner;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int T1 = sc.nextInt();
		System.out.println("Enter Second Number ");
		int T2 = sc.nextInt();
		System.out.println("Enter Second Number ");
		int T3 = sc.nextInt();
		int bonus;
		if (T1==T2 && T1==T3 && T2==T1 && T2==T3 & T3==T1 && T3==T2) {
			System.out.println("It's a triangle");
		} else {
			System.out.println("not a Triangle");
		}
	}
}