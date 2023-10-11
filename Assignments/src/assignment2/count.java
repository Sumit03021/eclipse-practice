package assignment2;
import java.util.*;
public class count {
	public static int countDigits(long n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long num=countDigits(n);
		System.out.println(num);

	}

}
