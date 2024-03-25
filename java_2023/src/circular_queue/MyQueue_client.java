package circular_queue;

public class MyQueue_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
MyQueue q=new MyQueue();
try {
	q.enqueue(23);
	q.enqueue(34);
	q.enqueue(45);
	q.enqueue(56);
	q.enqueue(34);
	q.dequeue();
	q.dequeue();
	q.dequeue();
	q.dequeue();
	q.enqueue(67);
	q.enqueue(78);
	q.enqueue(89);
	q.enqueue(90);
	
}catch(Exception e){
	System.out.println(e);
}

	}

}
