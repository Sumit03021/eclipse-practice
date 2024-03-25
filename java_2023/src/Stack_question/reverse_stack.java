package Stack_question;
import java.util.*;
public class reverse_stack {
	public static void insert(Stack<Integer>s,int val) {
		if(s.empty()==true) {
			s.push(val);
			return ;
		}
		int temp=s.pop();
		insert(s,val);
		s.push(temp);
	}
public static void reverse(Stack<Integer>s,int temp) {
	if(s.empty()==true) {
		return;
	}
	
	temp=s.pop();
	reverse(s,temp);
	insert(s,temp);

			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>s=new Stack<>();
s.push(23);
s.push(34);
s.push(52);
s.push(56);
s.push(60);
reverse(s,s.peek());
System.out.println(s);
	}

}
