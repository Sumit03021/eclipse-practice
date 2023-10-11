package assignment2;
import java.util.*;
public class checkingArmstrongNumber {
	public static boolean armstrong(long n,long count) {
		long i=1,sum=0;
		long n1=n;
		while(n>0) {
			long rem=n%10;
			n=n/10;
			sum=(long)Math.pow(rem,count)+sum;
			i++;
			
		}
		
		if(sum==n1) {
			return true;
		}
		else {
			return false;
		}
			
	}
	public static long countDigits(long n) {
		long count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		//long n2=s.nextLong();
		long count=countDigits(n);
		
		boolean check=armstrong(n,count);
		System.out.println(check);
	}

}
