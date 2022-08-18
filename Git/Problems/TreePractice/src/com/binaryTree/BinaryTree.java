package com.binaryTree;

public class BinaryTree {

	//left - root - right
	private static void inOrderTraversal(TreeNode n) {
		if(n == null) {
			return;
		}
		inOrderTraversal(n.left);
		System.out.println(n.value+" ");
		inOrderTraversal(n.right);
	}
	//root - left - right
	private static void preOrderTraversal(TreeNode n) {
		if(n == null) {
			return;
		}
		System.out.println(n.value+" ");
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
	}
	//left - right - root
	private static void postOrderTraversal(TreeNode n) {
		if(n == null) {
			return;
		}
		postOrderTraversal(n.left);
		postOrderTraversal(n.right);
		System.out.println(n.value+" ");
		
	}
	public static void main(String[] args) {
		
		 TreeNode tNode = createBinaryTree();
		 System.out.println("InOrder");
		 inOrderTraversal(tNode);
		 System.out.println("PreOrder");
		 preOrderTraversal(tNode);
		 System.out.println("PostOrder");
		 postOrderTraversal(tNode);
		
	}
	
	
	//Left root right 
	//Root left right
	//left right root

	private static TreeNode createBinaryTree() {
		
		TreeNode a = new TreeNode(10);
		TreeNode b = new TreeNode(20);
		TreeNode aa = new TreeNode(30);
		TreeNode c = new TreeNode(40);
		TreeNode d = new TreeNode(28);
		TreeNode e = new TreeNode(27);
		TreeNode f = new TreeNode(40);
		TreeNode g = new TreeNode(29);
		TreeNode h = new TreeNode(50);
		
		a.left = b;
		a.right = aa;
		b.left = f;
		b.right = d;
		aa.left = e;
		aa.right = h;
		e.right = g;
		
		return a;
	}
	

}
