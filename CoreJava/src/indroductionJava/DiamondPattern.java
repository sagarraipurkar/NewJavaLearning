package indroductionJava;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 6;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= row; j++) {
				for (int k = 0; k >= i; k++) {
					System.out.print("*");

				}
				System.out.println("\n");
			}
		}
	}
}
