package code;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeLevelTrave107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        trave(root, 0, result);
        for(int i=0,j=result.size()-1 ;i<j;i++,j--){
        	List<Integer> tmp = result.get(i);
        	result.set(i, result.get(j));
        	result.set(j, tmp);
        }
        return result;
        
    }
	public void trave(TreeNode root,int level,List<List<Integer>> result){
		if(root ==null) return;
		
		if(level == result.size()){
			ArrayList<Integer> res= new ArrayList<Integer>();
			result.add(res);
		}
		result.get(level).add(root.val);
		trave(root.left, level+1, result);
		trave(root.right, level+1, result);
		
	}

}
