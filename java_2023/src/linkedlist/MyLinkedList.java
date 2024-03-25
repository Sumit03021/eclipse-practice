package linkedlist;

public class MyLinkedList {
 Node head;
 MyLinkedList(){
	 head=null;
 }
	void Insert_At_Begin(int val) {
		Node n1=new Node(val);
		n1.next=head;
		head=n1;
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("N");
	}
	void Insert_At_End(int val) {
		if(head==null) {
			Insert_At_Begin(val);
			return;
		}
		Node temp=head;
		while(temp.next!= null) {
			temp=temp.next;
		}
		Node n1=new Node(val);
		temp.next=n1;
	}
	void delete_from_begin() throws Exception {
		if(head==null) {
			throw new Exception("Linked List is already empty.");
		}
		Node temp=head.next;
		head.next=null;
		head=temp;
		
	}
	void delete_from_end() throws Exception{
		if(head==null) {
			throw new Exception("Linked List is already empty.");
		}
		if(head.next==null) {
			head=null;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	void insert_at_index(int i,int val) {
		int count=0;
		Node temp=head;
		while(count<i-1) {
			temp=temp.next;
			count++;
		}
		Node n1=new Node(val);
		n1.next=temp.next;
		temp.next=n1;
	}
	void delete_at_index(int i) {
		int count=0;
		Node temp=head;
		while(count<i-1) {
			temp=temp.next;
			count++;
		}
	Node remove=temp.next;
	temp.next=temp.next.next;
	remove.next=null;
	}
}
