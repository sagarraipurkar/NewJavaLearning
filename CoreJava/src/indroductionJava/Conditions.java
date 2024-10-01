package indroductionJava;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 40;
		int y = 20;
		int z = 35;
        System.out.println("Enter the two number");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		if (x > y && x > z) {
			System.out.println("X is greater");
		} else if (y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

		if (z % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		
		if (n1>n2){
			System.out.println("N1 is Greater");
			
		}else {
			System.out.println("N2 is Greater");
		}

	}

}
