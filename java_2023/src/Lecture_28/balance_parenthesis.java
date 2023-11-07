package Lecture_28;
import java.util.*;
public class balance_parenthesis {
public static void parenthesis(int open,int close,String s) {
	if(open==0 && close==0) {
		System.out.println(s);
		return;
	}
	if(open<0 || close<0) {
		return;
	}
	if(open>close) {
		return;
	}
	parenthesis(open-1,close,s+"(");
	parenthesis(open,close-1,s+")");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
parenthesis(n,n,"");

	}

}
