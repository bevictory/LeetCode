package hard;

public class MaxPathBt124 {
	private int maxSum = Integer.MIN_VALUE;
     public int maxPathSum(TreeNode root) {
        if(root ==null) return 0;
        max(root);
        return maxSum;
    }
     public int max(TreeNode root){
    	 if(root ==null) return 0;
    	 int left = max(root.left),right = max(root.right);
    	 int val = root.val;
    	 if(left >=0){
    		 val += left;
    	 }
    	 if(right >=0 ){
    		 val += right;
    	 }
    	 if(val >maxSum) maxSum = val;
    	 return Math.max(root.val, Math.max(root.val+left, root.val+right));
     }
}
