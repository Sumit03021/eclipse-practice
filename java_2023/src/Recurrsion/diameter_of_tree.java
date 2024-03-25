package Recurrsion;
import java.util.*;
public class diameter_of_tree {
	public int height(TreeNode root){
        if(root ==null){
            return -1;
        }
  int left_height = height(root.left);
  int right_height = height(root.right);
  return Math.max(left_height,right_height)+1;
    }
    public int helper(TreeNode root){
        if(root== null){
            return 0;
        }
        int left_dia = helper(root.left);
        int right_dia = helper(root.right);
        int left_height =height(root.left);
        int right_height = height(root.right);
        int mera_dia = left_height + right_height + 2;
        return Math.max(left_dia,Math.max(right_dia,mera_dia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
       return helper(root);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
