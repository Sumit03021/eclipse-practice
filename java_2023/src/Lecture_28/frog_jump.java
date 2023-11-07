package Lecture_28;
import java.util.*;
public class frog_jump {
public static void jump( int n,String ans,int count) {
	if(count==0) {
		System.out.println(ans);
		return;
	}
	if(count<0) {
		return;
		
	}
	jump(n,ans+"1",count-1);
	jump(n,ans+"2",count-2);
	jump(n,ans+"3",count-3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
jump(n,"",n);
	}
}
