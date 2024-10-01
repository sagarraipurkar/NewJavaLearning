package indroductionJava;

public class StringNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sagar Raipurkar";

		String s1 = new String("Sagar Raipurkar");
		System.out.println(s1);
		String[] s2 = s1.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		for (int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}

	}

}
