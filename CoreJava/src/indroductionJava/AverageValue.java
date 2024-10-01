package indroductionJava;

public class AverageValue {

	public static void main(String[] args) {

		int[] a = new int[5];

		int[] a1 = { 1, 2, 3, 4, 5 };

		int[][] a3 = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(a1[1]);
		System.out.println(a3[1][1]);

		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3[i].length; j++) {
				System.out.print(a3[i][j] + " ");
			}

		}

	}
}