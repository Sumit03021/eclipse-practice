package DP;
import java.util.*;
public class fibonacci_DP {
	static int count=0;
	public static int fibo(int n,HashMap<Integer,Integer>m) {
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(m.containsKey(n)) {
			return m.get(n);
		}
		
		count++;
		System.out.println("n is "+n+", count is "+count);
		int ans1 = fibo(n-1,m);
		int ans2 = fibo(n-2,m);
		int bada_ans = ans1 + ans2;
		
		if(m.containsKey(n)==false) {
			m.put(n,bada_ans);
		}
		return bada_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// overlapping of sub problems in recurrsion then always use ---DP(have own brain) but recurrsion (does not have own brain)
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		HashMap<Integer,Integer>m = new HashMap();
		System.out.println(fibo(n,m));
	
	}

}
