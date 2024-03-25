package linkedlist;

public class LinkedList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node n1=new Node(13);
Node head=n1;
System.out.println(n1);
Node n2=new Node(14);
n1.next=n2;
System.out.println(n2);
System.out.println(n1.next);
Node n3=new Node(15);
n2.next=n3;
System.out.println(n3);
System.out.println(n2.next);
	}

}
