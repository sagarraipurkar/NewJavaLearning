package indroductionJava;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		int English = 0;
		int Hindi = 0;
		int Maths = 0;

		System.out.println("Enter the number of subject English");
		Scanner src = new Scanner(System.in);
		English = src.nextInt();
		System.out.println("Enter the number of subject Hindi");
		Hindi = src.nextInt();
		System.out.println("Enter the number of subject Maths");
		Maths = src.nextInt();

//		int EnglishPer = English * 100 / 100;
//		System.out.println("Percentage in English" + EnglishPer);
//
//		int HindiPer = Hindi * 100 / 100;
//		System.out.println("Percentage in English" + HindiPer);
//
//		int Mathsper = Maths * 100 / 100;
//		System.out.println(Mathsper);

		int totalper = (English + Hindi + Maths) * 100 / 300;
		System.out.println(totalper);

		if (totalper >= 40 && English >33 && Hindi>33 && Maths>33 ) {
			System.out.println("You are Pass");
		} else {
			System.out.println("You are Fail");
		}
	}
}