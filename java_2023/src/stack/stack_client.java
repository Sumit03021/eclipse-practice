package stack;

public class stack_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// throws from main called then ---message to jvm--- and handle by jvm.
MyStack s=new MyStack();
System.out.println(s.isempty());
try {
	s.pop();
}catch(Exception a){
	System.out.println(a);
}
try{
	s.push(20);
s.push(30);
s.push(100);
s.push(200);
s.push(212);
s.push(234);
}catch(Exception e) {
	System.out.println(e);
}
s.pop();
System.out.println(s.peek());
	}

}
