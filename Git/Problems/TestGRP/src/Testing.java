import java.util.ArrayList;
import java.util.List;

public class Testing {

public static class TestingParent {	
	void print() {
		System.out.println("Testing parent...");
	}
}
public static class TestingChild extends TestingParent{
	
	void print() {
		System.out.println("Testing child...");
	}
}
	
	public static void main(String args[]) {
		TestingParent obj1 = new TestingParent();
		TestingChild obj2 = new TestingChild();
		
		obj1.print();
		obj2.print();
	}
	

}
