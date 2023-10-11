package assignment2;
import java.util.*;
public class nthFibonacii {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		long a=0;
		long b=1;
		//long c=a+b;
		int i=3;
		if(n==0) {
			System.out.println("0");
		}
		else if(n==1) {
			System.out.println("1");
		}
		else {
			long c=a+b;
		while(i<=n ) { 
			a=b;
			b=c;
			c=a+b;
			i++;
		}
		
		System.out.println(c);
		
		}
		
			
	}

}
