package indroductionJava;
public class StringChar {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		String Name = new String("Sagar Raipurkar");
		System.out.println(Name);

		String Name1 = "Sagar Raipurkar";
		System.out.println(Name1);
		Name1.toUpperCase();
		System.out.println(Name1.toUpperCase());
		System.out.println(Name1.toLowerCase());
		System.out.println(Name1.charAt(3));
		System.out.println(Name1.contains("B"));
		System.out.println(Name1.compareTo(Name));
		System.out.println(Name1.concat(" " + Name));
		System.out.println(Name1.contentEquals("Sagar Raipurkar"));
		System.out.println(Name1.endsWith("r"));
		System.out.println(Name1.contentEquals(Name));
		System.out.println(Name1.replaceAll(Name, Name1));
		System.out.println(Name1.length());
		System.out.println(Name1.trim());
		System.out.println(Name1.replace(" ", "_"));

		String Html = "Dear <|Name|>, Thanks a lot";
		System.out.println(Html.replace("<|Name|>", "Sagar"));

	}

}
