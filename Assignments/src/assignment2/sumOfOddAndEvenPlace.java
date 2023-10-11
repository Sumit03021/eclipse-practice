package assignment2;
import java.util.*;
public class sumOfOddAndEvenPlace {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long sumOfOdd=0;
		long sumOfEven=0;
		long i=1;
		while(n>0) {
			long rem =n%10;
			n=n/10;
			if(i%2==0) {
				sumOfEven=rem+sumOfEven;
			}
			else {
				sumOfOdd=rem+sumOfOdd;
			}
			i++;
			
		}
		System.out.println(sumOfOdd);
		System.out.println(sumOfEven);

	}

}
