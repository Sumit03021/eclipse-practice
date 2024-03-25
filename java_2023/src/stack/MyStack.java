package stack;

public class MyStack {

	private int []data;
	private int top;
	MyStack(){
		data=new int[5];
		top=-1;
	}
	MyStack(int cap){
		data= new int[cap];
		top=-1;
	}
	
	public boolean isempty() {
		return top==-1;
	}
	
	public boolean isfull() {
		return top==data.length-1;
	}
	
	public void push(int d) throws Exception {
		if(isfull()==true) {
		throw new Exception("Stack is out of bound.");//message
// stack trace---on which line errors.
// exception handling --- throws and try & catch methods.
// throws--as indicator for who calls.
// throw--- message to jvm.
		}
// exception---error can be handled by developers.
// errors----cannot be reached to handles.--stackoverflow.
		top++;
		data[top]=d;
	}
	
	public int pop() throws Exception{
		if(isempty()==false) {
			int temp=data[top];
			top--;
			return temp;	
		}else {
			throw new Exception("Stack is empty.");
		}
		
	}
	
	public int peek()throws Exception {
		if(isempty()==true) {

		throw new Exception("not exist");	
		}
			return data[top];
	}
}
