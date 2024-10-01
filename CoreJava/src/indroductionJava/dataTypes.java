package indroductionJava;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte Single = '2';
		int Mynumber = '1';
		String MyName = "Sagar Raipurkar";
		char FirstNameCharacter = '\u0041';
		double Weight = 6.550;
		String s = "Newvalue in number";
		
		
		int[] arr1 = new int[5];
		arr1 [0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		String FirstName = "Sagar";
		String LastName = "Raipurkar";
		

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(FirstName.concat(LastName));

		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("in"));
		System.out.println(arr1[3]);
		System.out.println(arr[2]);
		System.out.println(FirstNameCharacter);
		System.out.println(Single);
	}	
}
