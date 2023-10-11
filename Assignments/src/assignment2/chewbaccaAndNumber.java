package assignment2;
import java.util.*;
public class chewbaccaAndNumber {
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
		long n1=n;
		long count=countDigits(n);
		long i=1,sum=0;
		//System.out.println(count);
		int j=1;
		while(n>0) {
			long rem=n%10;
			
			if(9-rem<rem &&j!=count) {
				
				sum=(9-rem)*(long)Math.pow(10,i-1)+sum;
			}
			else if (j==count && rem<9 && rem>4) {
				sum=(9-rem)*(long)Math.pow(10,i-1)+sum;
			}
			else {
				sum=rem*(long)Math.pow(10,i-1)+sum;
			}
			
			n=n/10;
			i++;
			j++;
			
			
		}
		System.out.println("sum :"+sum);
		
				
		}
		
		

	}


