package Lecture_28;
import java.util.*;
public class tower_of_hanoi {
public static void printtoh(int n,String a,String b,String c) {
	if(n==0) {
		return;
	}
	printtoh(n-1,a,c,b);
	System.out.println("Move the "+n+" ring from the rod "+a+" to the rod "+c);
	printtoh(n-1,b,a,c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
printtoh(n,"A","B","C");
	}

}
