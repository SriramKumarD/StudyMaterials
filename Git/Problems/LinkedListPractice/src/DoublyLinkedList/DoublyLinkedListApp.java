package DoublyLinkedList;
class Node {
	int data;
	Node previous;
	Node next;
}

class DoublyLinkedList{
	
	public Node getNewNode(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.previous = null;
		newNode.next = null;
		return newNode;
	}
	//It will add the node at last position
	public Node insert(int value, Node node) {
		
		if(node == null) {
			return getNewNode(value);
		}
		Node head = node;
		
		while(node.next != null) {
			node = node.next;
		}
		Node a = getNewNode(value);
		
		node.next = a;
		a.previous = node;
		
		return head;
		
	}

	//It will add the node at given position
	public Node insert(int value, Node head, int position) {
	
		if(head == null) {
			if(position == 1) {
				return getNewNode(value);
			}
			else {
				System.out.println("There is no nodes in a Tree...");
				return null;
			}
			
		}
		if(position == 1) {
			return insertAtStart(value, head);
		}
		Node node = head;
		while(node != null && position > 2) {
			node = node.next;
			position --;
		}
		if(node == null) {
			System.out.println("Position is not valid...");
			return head;
		}
		Node a = getNewNode(value);
		a.next = node.next;
		a.previous = node;
		if(node.next != null) {
			node.next.previous = a;
		}
		node.next = a;
		return head;
	}

	//It will add the node at first position
	public Node insertAtStart(int value, Node head) {
		
		if(head == null) {
			return getNewNode(value);
		}
		Node a = getNewNode(value);
		head.previous = a;
		a.next = head;
		return a;
	}

	//It will delete a first node
	public Node deleteFirstNode(Node head) {
		
		if(head == null) {
			return null;
		}
		if(head.next != null) {
			head.next.previous = null;
		}
		return head.next;
		
	}

	//It will delete a node based on given data
	public Node delete(Node head, int data) {
		
		if(head == null) {
			return head;
		}
		if(head.data == data) {
			if(head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}
		Node node = head;
		while(node != null) {
			if(node.data == data) {
				break;
			}
			node = node.next;
		}
		if(node == null) {
			System.out.println("Element does not exists...");
			return head;
		}
		//This condition only for last node
		if(node.next != null) {
			node.next.previous = node.previous;
		}
		node.previous.next = node.next;
		
		
		return head;
	}
	//It will delete a node based on given position
	public Node deleteAtGivenPosition(Node head, int position) {
		
		if(head == null) {
			return head;
		}
		if(position == 1) {
			if(head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}
		Node node = head;
		while(node != null && position > 1) {
			node = node.next;
			position--;
		}
		if(node == null) {
			System.out.println("Element doesn't exists...");
			return head;
		}
		//This condition only for last node
		if(node.next != null) {
			node.next.previous = node.previous;
		}
		node.previous.next = node.next;
		
		return head;
		
	}
	public Integer getSize(Node node) {
		if(node == null) {
			return 0;
		}
		int count = 0;
		while(node != null) {
			node = node.next;
			count ++;
		}
		return count;
	}
	public void printAllNodes(Node head) {
		
		if(head == null) {
			System.out.println("There is no nodes in the tree...");
			return;
		}
		Node node = head;
		while(node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println("null");
		
	}
	public Node rotateList(Node head, int k) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		k = k % getSize(head);
		
		Node node = head;
		
		if(k == 0) {
			return head;
		}
		
		while(node != null && k > 1) {
			node = node.next;
			k--;
		}
		Node newHead = node.next;
		newHead.previous = null;
		node.next = null;
		
		Node temp = newHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.previous = temp;
		
		return newHead;
	}
	
}

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList obj = new DoublyLinkedList();
		
		Node head = null;
		//System.out.println("Size of Doubly Linked List :"+obj.getSize(head));
	    head = obj.insert(12, head);
	    head = obj.insert(99, head);
	    head = obj.insert(37, head);
	    head = obj.insert(5, head);
	    head = obj.insert(25, head);
	    //head = obj.insertAtStart(35, head);
	    //head = obj.insertAtStart(45, head);
	    //head = obj.insert(23, head, 1);
	    //head = obj.insert(27, head, 9);
	    
	    
	    //(i)Delete first node
	    //head = obj.deleteFirstNode(head);
	    
	    //(ii)Deleting the node based on value
	    //head = obj.delete(head, 37);
	    
	    //(iii) Deleting the node based on position
	      //head = obj.deleteAtGivenPosition(head, 5);
	   //(iv) Get the size of Doubly linked list
	
	    //System.out.println("Size of Doubly Linked List :"+obj.getSize(head));
	    //(v) Print all the nodes in the Doubly Linked List
	    obj.printAllNodes(head);
	    
	    //(vi)Rotate List by k 
	    head = obj.rotateList(head, 7);
	    
	    obj.printAllNodes(head);
	    
	}



}
