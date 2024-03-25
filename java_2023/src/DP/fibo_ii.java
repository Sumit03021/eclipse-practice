package DP;

import java.util.*;
import java.util.Scanner;

public class fibo_ii {
	static int count=0;
	public static int fibo(int n,int []m) {
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		if(m[n]!=0) {
			return m[n];
		}
		
		count++;
		System.out.println("n is "+n+", count is "+count);
		int ans1 = fibo(n-1,m);
		int ans2 = fibo(n-2,m);
		int bada_ans = ans1 + ans2;
		
		if(m[n]==0) {
			m[n]=bada_ans;
		}
		return bada_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
	
		int []m =new int[n+1];
		System.out.println(fibo(n,m));
	}

}
