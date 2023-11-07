package Lecture_28;
import java.util.*;
public class jump_dice_call {
public static void jumpdice(int n,String ans) {
	if(n==0) {
		System.out.println(ans);
		return;
	}
	if(n<0) {
		return;
	}
	for(int i=1;i<=6;i++) {
		jumpdice(n-i,ans+i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
jumpdice(n-1,"");
	}

}
