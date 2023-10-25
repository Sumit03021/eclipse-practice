package Lecture_26;
import java.util.*;
public class natural_increase {
public static void natural(int n) {
	if(n==0) {
		return;
	}
	natural(n-1);
	System.out.print(n+" ");

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
natural(n);
	}

}
