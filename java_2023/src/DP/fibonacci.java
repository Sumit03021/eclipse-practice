package DP;
import java.util.*;
public class fibonacci {
  static int count=0;
	public static int fibo(int n) {
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		count++;
		System.out.println("n is "+n+", count is "+count);
		int ans1 = fibo(n-1);
		int ans2 = fibo(n-2);
		int bada_ans = ans1 + ans2;
		return bada_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n= s.nextInt();
System.out.println(fibo(n));
	}

}
