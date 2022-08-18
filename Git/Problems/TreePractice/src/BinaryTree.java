
public class BinaryTree {
	
	TreeNode root;
	
	public void CreateBinaryTree(int data) {
		TreeNode node = new TreeNode();
		node.data = data;
		if(root == null) {
			root = node;
		}
	}

}
