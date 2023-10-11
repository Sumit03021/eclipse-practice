package assignment2;
import java.util.*;
public class printReverse {
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
		//long key=s.nextLong();
		long pow=countDigits(n);
		long i=1;
		long sum=0;
		while(n>0) {
			long rem=n%10;
			n=n/10;
			sum= sum+rem*(long)Math.pow(10, pow-1);
			i++;
			pow--;
		}
		System.out.println(sum);

	}

}
