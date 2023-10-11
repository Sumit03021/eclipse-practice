package assignment2;
import java.util.*;
public class armstrongNumberInRange {
	public static long armstrong(long n1, long count) {
		long i=1,sum=0;
	      while(n1>0) {
			long rem=n1%10;
			n1=n1/10;
			sum=(long)Math.pow(rem,count)+sum;
			i++;
		}
	     return sum;
	}
	public static long countDigits(long n1) {
		long count=0;
		while(n1>0) {
			n1=n1/10;
			count++;
		}
		//System.out.print(count);
		return count;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n1=s.nextLong();
		long n2=s.nextLong();
		long count=countDigits(n1);
		for(long i=n1;i<=n2;i++) {
		long sum=armstrong(n1,count);
		if(sum==n1) {
		System.out.println(sum);
		}
			n1++;
		}
		
	}

}
