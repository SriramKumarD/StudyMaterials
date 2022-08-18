
public class MergeTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//First linkedList
		Node head1 = new Node(3);
		head1.next = new Node(5);
		head1.next.next = new Node(6);

		//Second Linked List
		Node head2 = new Node(7);
		head2.next = new Node(1);
		head2.next.next = new Node(9);
		
		Node mergeNode = mergeTwoLinkedList(head1, head2);
		
		showlist(mergeNode);
		
	}

	private static void showlist(Node mergeNode) {
		while(mergeNode.next != null) {
			System.out.print("MergeLinkedList:"+mergeNode.data+"->");
			mergeNode = mergeNode.next ; 
		}
		if(mergeNode.next == null) {
			System.out.print("MergeLinkedList:"+mergeNode.data);
		}
	}

	private static Node mergeTwoLinkedList(Node head1, Node head2) {
		
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		if(head1.data < head2.data) {
			head1.next = mergeTwoLinkedList(head1.next, head2);
			return head1;
		}
		else {
			head2.next = mergeTwoLinkedList(head1, head2.next);
			return head2;
		}
		
	}

}
