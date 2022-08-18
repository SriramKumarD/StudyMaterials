package DoublyLinkedList;

class SingleNode {
	int data;
	SingleNode next;
	
}

class SinglyCircularLinkedList {
	SingleNode tail = null;

	public SingleNode insert(SingleNode head, int value) {
		SingleNode node = new SingleNode();
		if(head == null) {
			node.data = value;
			tail = node;
			return node;
		}
		else {
			node.data = value;
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		
		return head;
	}
	void show(SingleNode node) {
		
		
		while(node.next != null){
			System.out.print(node.data+"->");
			node = node.next;
		}
		if(node.next == null) {
			System.out.print(node.data);
		}
		
	}

	

}
public class SinglyCircularLinkedListApp{
	
	public static void main(String[] args) {
		
		SinglyCircularLinkedList obj = new SinglyCircularLinkedList();
		
		SingleNode head = null;
			
		head = obj.insert(head, 1);
		head = obj.insert(head, 2);
		head = obj.insert(head, 3);
		head = obj.insert(head, 4);
		//obj.show(head);
		
		
		
	}
}
