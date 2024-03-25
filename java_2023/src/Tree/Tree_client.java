package Tree;
import java.util.*;
public class Tree_client {
public static void Preorder(TreeNode root) {
	if(root==null) {
		System.out.print("null"+" ");
		return;
	}
	System.out.print(root.data+" ");
	Preorder(root.left);
	Preorder(root.right);
}
public static void Inorder(TreeNode root) {
	if(root==null) {
		System.out.print("null"+" ");
		return;
	}
	Inorder(root.left);
	System.out.print(root.data+" ");
	Inorder(root.right);
}
public static void Postorder(TreeNode root) {
	if(root==null) {
		System.out.print("null ");
		return;
	}
	Postorder(root.left);
	Postorder(root.right);
	System.out.print(root.data+" ");
}
public static int sum(TreeNode root) {
	if(root==null) {
		return 0;
	}
	int left_sum=sum(root.left);
	int right_sum=sum(root.right);
	return left_sum+right_sum+root.data;
}
public static boolean search(TreeNode root,int val) {
	if(root ==null) {
		return false;
	}
	boolean left_ans=search(root.left,val);
	boolean right_ans=search(root.right,val);
	if(root.data==val||left_ans==true||right_ans==true) {
		return true;
	}else {
		return false;
	}
}
public static Pair maxmin(TreeNode root) {
	if(root==null) {
		return new Pair();
	}
	
	Pair left_ans=maxmin(root.left);
	Pair right_ans=maxmin(root.right);
	Pair value=new Pair();
	value.max=Math.max(root.data,Math.max(left_ans.max,right_ans.max));
	value.min=Math.min(root.data,Math.min(left_ans.min,right_ans.min));
	return value;
}
public static int height(TreeNode root) {
	//104 leetcode
	if(root==null) {
		return 0;
	}
	int count1=height(root.left);
	int count2=height(root.right);
	int count=0;
	count=Math.max(count+1,Math.max(count1+1, count2+1));
	// int count=Math.max(count1+1,count2+1); also done same work.
	return count;
}
public static int edgesHeight(TreeNode root) {
	if(root==null) {
		return -1;
	}
	if(root.left==null && root.right==null) {
		return 0;
	}
	int count1 = edgesHeight(root.left);
	int count2 = edgesHeight(root.right);
	int count = Math.max(count1, count2)+1;
	return count;
}
public static boolean pathsum(TreeNode root,int val) {
	// 112 leetcode
	if(root==null) {
		return false;
	}
	if(root.left==null && root.right==null) {
		return root.data==val;
	}
	boolean left_sum=pathsum(root.left,val-root.data);
	boolean right_sum=pathsum(root.right,val-root.data);
	if(left_sum==true||right_sum==true) {
		return true;
	}else {
		return false;
	}
	
}
// 12 13 null 17 null null 14 15 null null null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tree Mytree=new Tree();
Preorder(Mytree.root);
System.out.println();
Inorder(Mytree.root);
System.out.println();
Postorder(Mytree.root);
System.out.println();
System.out.println(sum(Mytree.root));
System.out.println(search(Mytree.root,14));
Pair ans=maxmin(Mytree.root);
System.out.println(ans.max+","+ans.min);
System.out.println(height(Mytree.root));
System.out.println(edgesHeight(Mytree.root));
System.out.println(pathsum(Mytree.root,71));
	}

}
