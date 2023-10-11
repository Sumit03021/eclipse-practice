package assignment2;
import java.util.*;//31245
public class printReverseDifferntly {
	public static long inverse(long n) {
		long i=1,sum=0;
		while(n>0) {
			long rem=n%10;
			sum=i*(long)Math.pow(10,rem-1)+sum;
			n=n/10;
			i++;
		}
		return sum;
		
	}
	public static long count(long n) {
		long count=0;
		while(n>0) {
			long rem=n%10;
			n=n/10;
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long sum=inverse(n);
		System.out.println(sum);

	}

}
