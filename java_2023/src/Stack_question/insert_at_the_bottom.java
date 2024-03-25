package Stack_question;
import java.util.*;
public class insert_at_the_bottom {
public static void insert(Stack <Integer> s,int val) {
	if(s.empty()==true) {
		s.push(val);
		return;
	}
	int temp=s.pop();
	insert(s,val);
	s.push(temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack<Integer>();
s.push(23);
s.push(34);
s.push(52);
s.push(56);
insert(s,50);
System.out.println(s);
	}

}
