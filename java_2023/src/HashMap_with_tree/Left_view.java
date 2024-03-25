package HashMap_with_tree;
import java.util.*;

import Tree.*;

public class Left_view {
public static void left_view(TreeNode root,HashMap<Integer,Integer>mh,int level){
	if(root==null) {
		return;
	}
	if(mh.containsKey(level)==false) {
		mh.put(level,root.data);
	}
	left_view(root.left,mh,level+1);
	left_view(root.right,mh,level+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Tree myTree = new Tree();
  
	}

}
