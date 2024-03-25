package Stack_question;
import java.util.*;
public class balance_parenthesis {
public static boolean isbalance(String str) {
	Stack<Character>s=new Stack<>();
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='(') {
		s.push('(');
	}else if(str.charAt(i)==')') {
		if(s.size()==0) {
			return false;
		}
		s.pop();
	}
	}
	if(s.size()>0) {
		return false;
	}
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(isbalance(str));
	}

}
