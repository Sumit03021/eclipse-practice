package queue;

public class MyQueue {
 private int []data;
 private int front;
  private int rear;
   MyQueue() {
	   data=new int[5];
	  front=-1;
	  rear=-1;
  }
   MyQueue(int cap){
	   data=new int[cap];
	   front=-1;
	   rear=-1;
   }
	public boolean isempty() {
		return (front==-1 && rear==-1);
	}
	public boolean isfull() {
		return rear==data.length-1;
	}
	
	public void enqueue(int d) throws Exception{

		if(isfull()==true) {
			throw new Exception("Queue is out of bound");
		}else if(isempty()==true) {
			front++;
			rear++;
			data[front]=d;
		}else {
		rear++;
		data[rear]=d;
		}
	}
	
	public int dequeue() throws Exception{
	  if(isempty()==true) {
		  throw new Exception("Queues is already empty.");
	  }else if(rear==front){
		  int ans=data[front];
		  rear=-1;
		  front=-1; 
		  return ans;
	  }
		  int temp=data[front];
		  front++;
		  return temp;
	}
	public String tostring() {
		String ans="[";
		for(int i=front;i<data.length;i++) {
			ans+=data[i]+", ";
		}
		ans+="]";
		return ans;
	}
}
