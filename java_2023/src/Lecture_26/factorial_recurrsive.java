package Lecture_26;
import java.util.*;
public class factorial_recurrsive {
public static int fact(int n) {
	if(n==1) {//+ve base case
		return 1;
	}
	if(n==0) {//-ve base case
		return 1;
	}
	int chhota_ans=fact(n-1);
	int bada_ans=n*chhota_ans;
	return bada_ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(fact(n));
	}

}
