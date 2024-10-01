package indroductionJava;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int productpirce = 100;
		System.out.println("Take the Quantity");
		Scanner src = new Scanner(System.in);
		int qunatity = src.nextInt();
		
		int total = qunatity*productpirce;
		
		if (total>2000) {
			int discount = total*10/100;
			System.out.println("Discount on Quanity" + " " +  discount);
			System.out.println("Total payable amount" + " " +   (total-discount));
		}

	}

}
