
public class LinkedList {
	
	Node head;
	//It will add the node at last Index /// 5(head)->   (10)
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				
				n = n.next;
			}
			n.next = node;
		}
		
	}
	//It will add the node at starting Index
	void insertAt(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	//It will add the node at given Index 
	void insertAt(int index, int data) {
		if(index == 0) {
			insertAt(data);
		}
		else {
		
			Node node = new Node();
			node.data = data;
			
			Node n = head;
			
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	//It will delete the node from given Index
	void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			Node n1 = n.next;
			n.next = n1.next;
			
			
			System.out.println("Deleting Node Index="+index+" Value="+n1.data);
		}
	}
	void show() {
		Node node = head;
		
		while(node.next != null){
			System.out.print(node.data+"->");
			node = node.next;
		}
		if(node.next == null) {
			System.out.print(node.data);
		}
		
	}
}
