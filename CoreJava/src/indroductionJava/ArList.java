package indroductionJava;

import java.util.ArrayList;

public class ArList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Sagar");
		a.add("Raipurkar");
		a.add("Automation");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		for (String val : a) {
			System.out.println(val);
		}
	}

}
