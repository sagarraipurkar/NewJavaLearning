package indroductionJava;

public class AndOrNotOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int b = 6;
		int c = 6;

		boolean d = false;

		if (a == b && a == c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (a == b || a == c) {
			System.out.println("True");  
		} else {
			System.out.println("False");
		}

		System.out.println(!d);
	}
}
