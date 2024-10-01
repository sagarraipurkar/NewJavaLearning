package indroductionJava;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 0;
		System.out.println("Enter the Weekday Number");
		Scanner Day = new Scanner(System.in);
		day = Day.nextInt();

		switch (day) {
		case 0:
			System.out.printf("Sunday");
			break;

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a valid Weekday");
		}

	}

}
