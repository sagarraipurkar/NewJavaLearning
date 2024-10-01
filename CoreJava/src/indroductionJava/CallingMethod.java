package indroductionJava;

public class CallingMethod {

	public static void mydata() {
		System.out.println("Sagar Raipurkar");

	}

	public void newdata() {
		System.out.println("Juhi Raipurkar");
	}

	public static void main(String[] args) {
		mydata();
		CallingMethod d1 = new CallingMethod();
		d1.newdata();

		CallingMethod2 d2 = new CallingMethod2();
		d2.newotherclasdata();

	}
}
