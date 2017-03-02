package code;

import java.util.ArrayList;
import java.util.List;


public class LCA236 {
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pPath= new ArrayList<TreeNode>();
        ArrayList<TreeNode> qPath= new ArrayList<TreeNode>();
        pPath.add(root);
        qPath.add(root);
        getPath(root, p, pPath);
        getPath(root, q, qPath);
        TreeNode lca=null;
        for(int i =0;i<pPath.size()&&i< qPath.size();i++){
        	if(pPath.get(i) == qPath.get(i)){
        		lca = pPath.get(i);
        	}else break;
        }
        return lca;
    }
	public boolean getPath(TreeNode root, TreeNode n, List<TreeNode> path){
		if(root == n) return true;
		if(root.left != null){
			path.add(root.left);
			if(getPath(root.left, n, path)) return true;
			path.remove(path.size()-1);
		}
		if(root.right != null){
			path.add(root.right);
			if(getPath(root.right, n, path)) return true;
			path.remove(path.size()-1);
		}
		return false;
	}
}
