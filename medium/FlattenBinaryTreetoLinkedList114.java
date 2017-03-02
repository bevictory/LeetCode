package medium;

public class FlattenBinaryTreetoLinkedList114 {
	 private TreeNode lastNode =null;
	   public void flatten(TreeNode root) {
	        if(root ==null) return;
	        if(lastNode!=null){
	        	lastNode.left =null;
	        	lastNode .right = root;
	        }
	        lastNode = root;
	        TreeNode righTreeNode  = root.right;
	        flatten(root.left);
	        flatten(righTreeNode);
	    }
}
