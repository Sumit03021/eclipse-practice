package DP;
import java.util.*;
import Tree.*;
public class diameter_of_tree {
	public int height(TreeNode root,HashMap<TreeNode,Integer>m){
        if(root ==null){
            m.put(root,-1);
            return -1;
        }
  int left_height = height(root.left,m);
  int right_height = height(root.right,m);
  int mera_height = Math.max(left_height,right_height)+1;
  m.put(root,mera_height);
  return mera_height;
    }
    public int helper(TreeNode root,HashMap<TreeNode,Integer>m){
        if(root == null){
            return 0;
        }
        int left_dia = helper(root.left,m);
        int right_dia = helper(root.right,m);
        int mera_dia = m.get(root.left) + m.get(root.right) + 2;
        return Math.max(left_dia,Math.max(right_dia,mera_dia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        HashMap<TreeNode,Integer>m = new HashMap();
        height(root,m);
       return helper(root,m);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
