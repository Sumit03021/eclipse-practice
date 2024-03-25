package DP;

import java.util.*;

public class fibo_iii {
	static int count=0;
	public static int fibo(int n,ArrayList<Integer>m) {
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		if(m.contains(n)) {
			return m.get(n);
		}
		
		count++;
		System.out.println("n is "+n+", count is "+count);
		int ans1 = fibo(n-1,m);
		int ans2 = fibo(n-2,m);
		int bada_ans = ans1 + ans2;
		
		if(m.contains(n)==false) {
		m.set(n,bada_ans);
		}
		return bada_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
	
ArrayList<Integer>m =new ArrayList(n+1);
		m.ensureCapacity(n+1);
m.add(0);
m.add(1);
		
//		m.set(0, 0);
//		m.set(1,1);
//		System.out.println(m.size());
		System.out.println(fibo(n,m));
	}
}
