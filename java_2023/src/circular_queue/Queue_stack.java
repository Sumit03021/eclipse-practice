package circular_queue;
import java.util.*;
public class Queue_stack {

	private Stack<Integer>data;
	private int front;
	private int rear;
	Queue_stack(){
		data=new Stack<>();
		front=-1;
		rear=-1;
	}
	
	public void enqueue(int val) {
		data.push(val);
	}
	public int dequeue() {
//		void insert(Stack<Integer>s,int val) {
//			if(s.empty()==true) {
//				s.push(val);
//				return;
//			}
//			int temp=s.pop();
//			insert(s,val);
//			s.push(temp);
//		}
		return -1;
	}
	
}

