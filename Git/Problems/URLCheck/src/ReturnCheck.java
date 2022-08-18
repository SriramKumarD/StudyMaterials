
public class ReturnCheck {
	private static void init() {

		System.out.println("Checking...");
		
		method1();
		method2();
		
		method3();
		method4();
	}

	private static void method4() {
		// TODO Auto-generated method stub
		System.out.println("Checking4...");
		
	}

	private static void method3() {
		// TODO Auto-generated method stub
		System.out.println("Checking3...");
		
	}

	private static void method2() {
		// TODO Auto-generated method stub
		System.out.println("Checking2...");
		return;
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		System.out.println("Checking1...");
		return;
		
	}

	public static void main(String[] args) {


		init();

	}

	

}
