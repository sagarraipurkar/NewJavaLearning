package indroductionJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNormalArtoArList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "Selenium", "Sagar", "Raipurkar" };
		List<String> NameList = Arrays.asList(name);
		System.out.println(NameList);
		System.out.println(NameList.contains("Sagar"));

	}

}
