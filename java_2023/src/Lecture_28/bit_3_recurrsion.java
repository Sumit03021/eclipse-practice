package Lecture_28;
import java.util.*;
public class bit_3_recurrsion {
public static void printbit(int n,String ans) {
	if(ans.length()==n) {
		System.out.println(ans);
		return;
	}
	printbit(n,ans+"1");
	printbit(n,ans+"0");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
printbit(n,"");
	}

}
