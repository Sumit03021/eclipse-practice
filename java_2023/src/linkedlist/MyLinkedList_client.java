package linkedlist;

public class MyLinkedList_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
MyLinkedList list=new MyLinkedList();
list.Insert_At_Begin(23);
list.Insert_At_Begin(34);
list.Insert_At_Begin(45);
list.Insert_At_Begin(56);
list.Insert_At_Begin(67);
list.insert_at_index(2,70);
list.Insert_At_End(90);
list.Insert_At_End(89);
list.delete_at_index(3);
list.display();
list.delete_from_end();
list.display();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
