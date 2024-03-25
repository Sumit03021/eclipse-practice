package queue;

public class queue_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
MyQueue q=new MyQueue();

try {
	System.out.println(q.isempty());
	System.out.println(q.isfull());
	q.enqueue(23);
	q.enqueue(34);
//	q.dequeue();
	q.enqueue(52);
	q.enqueue(56);
//	q.dequeue();
	System.out.println(q.tostring());
}catch(Exception e) {
	System.out.println(e);
}

	}

}
