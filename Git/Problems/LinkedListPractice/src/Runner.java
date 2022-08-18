
public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);
		list.insertAt(45);
		list.insertAt(3,48);
		list.insertAt(0, 49);
		list.show();
		list.deleteAt(1);
		list.show();

	}

}
