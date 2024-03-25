package Tree;
import java.util.*;
public class Tree{
public TreeNode root;
Scanner s=new Scanner(System.in);
public Tree(){
	root=buildTree();
}
private TreeNode buildTree() {
	System.out.println("enter the data");
	String str=s.next();
	if(str.equals("null")) {
		return null;
	}
	int data=Integer.parseInt(str);
	TreeNode new_node=new TreeNode(data);
	System.out.println("enter the left child of "+data);
	new_node.left=buildTree();
	System.out.println("enter the right child of "+data);
	new_node.right=buildTree();
	return new_node;
}
}
