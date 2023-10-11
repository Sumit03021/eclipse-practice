package assignment2;
import java.util.*;
public class binaryToDecimal {
	public static long countDigits(long n) {
		long count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static long binaryToDecimal(long n) {
		long i=0;
		long sum=0;
		while(n>0) {
			long rem=n%10;
			n=n/10;
			sum= sum+rem*(long)Math.pow(2,i);
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long pow=countDigits(n);
		long decimal=binaryToDecimal(n);
		System.out.println(decimal);

	}

}
