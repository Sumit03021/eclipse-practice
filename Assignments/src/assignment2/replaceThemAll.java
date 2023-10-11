package assignment2;
import java.util.*;
public class replaceThemAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long n1=n;
		
		long i=1, sum=0;
		while(n>0) {
			long rem =n%10;
			n=n/10;
			if(rem==0) {
				rem=5;
			}
			sum=(long)Math.pow(10,i-1)*rem+sum;
		i++;
		}
		//System.out.println(n);
		//System.out.println(n1);
		if(n1==0) {
			System.out.println("5");
		}
		if(n1>0) {
		System.out.println(sum);
		}
	}
}


