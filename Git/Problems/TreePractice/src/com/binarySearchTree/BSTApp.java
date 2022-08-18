package com.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node left, right;
}

class BST {

	public Node insert(Node node, int val) {

		if (node == null) {
			Node a = new Node();
			a.data = val;
			a.left = null;
			a.right = null;
			return a;
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		}
		if (val > node.data) {
			node.right = insert(node.right, val);
		}

		return node;
	}

	public Node delete(Node node, int val) {

		if (node == null) {
			return null;
		}
		if (val < node.data) {
			node.left = delete(node.left, val);
		} else if (val > node.data) {
			node.right = delete(node.right, val);
		} else {
			if (node.left == null || node.right == null) {

				Node temp = null;

				temp = node.left == null ? node.right : node.left;

				if (temp == null) {
					return null;
				} else {
					return temp;
				}

			} else {
				Node successor = getSuccessorNode(node);
				node.data = successor.data;
				node.right = delete(node.right, successor.data);
				return node;
			}
		}
		return node;

	}

	private Node getSuccessorNode(Node node) {
		if (node == null) {
			return null;
		}
		Node temp = node.right;
		while (temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}

	public static void inOrder(Node node) {

		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void postOrder(Node node) {
		if (node == null) {
			return;
		}

		preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.data + " ");

	}

	public boolean isPresent(Node node, int val) {
		if (node == null) {
			return false;
		}
		boolean isPresent = false;
		while (node != null) {
			if (val < node.data) {
				node = node.left;
			} else if (val > node.data) {
				node = node.right;
			} else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

	public Node getParentNode(Node node, int val) {
		if (node == null) {
			return null;
		}
		Node parentNode = null;
		while (node != null) {
			if (val < node.data) {
				parentNode = node;
				node = node.left;
			} else if (val > node.data) {
				parentNode = node;
				node = node.right;
			} else {
				break;
			}
		}
		return node == null ? null : parentNode;
	}

	public Node getInOrderParent(Node node, int val) {

		if(node == null) {
			return null;
		}
		Node inOrderParent = null;
		while(node != null) {
			if(val < node.data) {
				inOrderParent = node;
				node = node.left;
			}
			else if(val > node.data) {
				node = node.right;
			}
			else {
				break;
			}
		}
		return node == null ? null : inOrderParent;
	}

	public Node getSuccessorNode(Node node, int val) {
		
		if(node == null) {
			return null;
		}
		Node successor = null;
		while(node != null) {
			if(val < node.data) {
				successor = node;
				node = node.left;
			}
			else if(val > node.data){
				node = node.right;
			}
			else {
				if(node.right != null) {
					successor = getSuccessorNode(node);
				}
				break;
			}
		}
		return node != null ? successor : null;
	}

	public int getDifferenceOddEvenLevels(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		return node.data - getDifferenceOddEvenLevels(node.left) -  getDifferenceOddEvenLevels(node.right);
		
	}

	public Integer getMax(Node node) {
		if(node == null) {
			System.out.println("Tree is empty..");
			return -1;
		}
		while(node.right != null) {
			node = node.right;
		}
		return node.data;
		
	}

	public Integer getMin(Node node) {
		if(node == null) {
			System.out.println("Tree is empty..");
			return -1;
		}
		while(node.left != null) {
			node = node.left;
		}
		return node.data;
	}
	public boolean checkIfTripletExists(Node node, int sum) {
	
		
		List<Integer> list = new ArrayList<Integer>();
		inorder(node, list);
		
		return checkIfTripletExistsUtil(sum, list);
				
	}

	public boolean checkIfTripletExistsUtil(Integer sum, List<Integer> list) {
	
		int size = list.size();
		int currentSum = 0;
		for(int i = 0; i < size -2; i++) {
			int start = i + 1;
			int end = size - 1;
			while(start < end) {
				currentSum = list.get(i) + list.get(start) + list.get(end);
				if(currentSum == sum) {
					System.out.println("Values : "+ list.get(i) +" " + list.get(start)+" " + list.get(end));
					return true;
				}
				else if(currentSum < sum) {
					start ++;
				}
				else {
					end --;
				}
			}
		}
		return false;
	}

	public static void inorder(Node node, List<Integer> list) {
		if(node == null) {
			return;
		}
		inorder(node.left, list);
		list.add(node.data);
		inorder(node.right, list);
	}

	public Node findLCA(Node node, int n1, int n2) {
		
		if(node == null) {
			return null;
		}
		
		while(node != null) {
			if(n1 < node.data && n2 < node.data) {
				node = node.left;
			}
			else if(n1 > node.data && n2 > node.data) {
				node = node.right;
			}
			else {
				break;
			}
		}
		return node;
	}

}

public class BSTApp {

	public static void main(String[] args) {

		BST obj = new BST();
		Node root = null;

		// Binary Tree : 8,10,3,1,6,4,7,14,13

		root = obj.insert(root, 8);
		root = obj.insert(root, 10);
		root = obj.insert(root, 3);
		root = obj.insert(root, 1);
		root = obj.insert(root, 6);
		root = obj.insert(root, 4);
		root = obj.insert(root, 7);
		root = obj.insert(root, 14);
		root = obj.insert(root, 13);

		// 1st case (0 child)

		//root = obj.delete(root, 1);

		// 2nd case (1 child)

		//root = obj.delete(root, 14);

		// 3rd case (2 child)

		//root = obj.delete(root, 3);

		// In order Traversal
		// obj.inOrder(root);

		// Pre Order Traversal
		// obj.preOrder(root);

		// Post Order Traversal
		// obj.postOrder(root);

		/*
		 * (i) check if a value exists in BST
		 */
		//System.out.println("Is a value exists : " + obj.isPresent(root, 112));

		
		//(ii) Get parent node of a given value in Binary Search Tree
		 
		/*
		 * Node parentNode = obj.getParentNode(root, 13); if(parentNode != null) {
		 * System.out.println("Parent node is :"+parentNode.data); } else {
		 * System.out.println("Parent node does not exists..."); }
		 */
		 

		///(iv) Get the in-order parent
		
		/*
		 * Node inOrderParent = obj.getInOrderParent(root, 7); if(inOrderParent != null)
		 * { System.out.println("In order parent : "+inOrderParent.data); } else {
		 * System.out.println("In order parent doesn't exists"); }
		 */
		
		//(v) Get an inorder successor of given value
		
//		Node successorNode = obj.getSuccessorNode(root,7);
//		System.out.println("Successor Node is : "+successorNode.data);
		
		
		//(vi) Get Difference of Even & Odd level values 
		
		//System.out.println(obj.getDifferenceOddEvenLevels(root));
		
		//(vii) Get Max value element in Binary Search Tree
		
		//System.out.println("Max value element in BST :"+obj.getMax(root));
		
		//(viii) Get Min value element in Binary Search Tree
		
		//System.out.println("Min value element in BST :"+obj.getMin(root));
		//(ix)check if triplet exists for a given sum in BST
		
		//System.out.println("Check if Triplet Exists : "+obj.checkIfTripletExists(root, 24));
		
		//(x) Find lowest common Ancestor for given values in BST
		Node lca = obj.findLCA(root, 4, 7);
		if(lca != null) {
			System.out.println(lca.data);
		}
	}
}
