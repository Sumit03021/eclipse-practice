package Lecture_28;
import java.util.*;
public class staircase_recurrsion {
public static void print_stair(int n,String ans,int currentstair) {
	if(n==currentstair) {
		System.out.println(ans);
		return;
	}
	if(currentstair>n) {
		return;
	}
	print_stair(n,ans+"1",currentstair+1);
	print_stair(n,ans+"2",currentstair+2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String ans="";
print_stair(n,ans,0);
	}

}
