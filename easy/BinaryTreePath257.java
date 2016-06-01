package code;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePath257 {
	List<String> result = new LinkedList<String>();
	List<Integer> path = new LinkedList<Integer>();
	public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
        	return null;
        }
        getPath(root);
        return result;
    }
	public void getPath(TreeNode root){
		if(root ==null){
			return;
		}
		path.add(root.val);
		if(root.left==null&&root.right ==null){
			StringBuffer stringBuffer = new StringBuffer();
			for(int i =0 ;i< path.size()-1;i++){
				stringBuffer.append(path.get(i));
				stringBuffer.append("->");
				
			}
			stringBuffer.append(path.get(path.size()-1));
			result.add(stringBuffer.toString());
			
		}
		if(root.left!=null){
			getPath(root.left);
		}
		if(root.right!=null) getPath(root.right);
		path.remove(path.size()-1);
	}

}
