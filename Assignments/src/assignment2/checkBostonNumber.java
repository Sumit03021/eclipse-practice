package assignment2;
import java.util.*;
public class checkBostonNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	      
	        long number = scanner.nextLong();
	        
	       
	        long sum=printPrimeFactors(number);
	        long digitSum=sumOfNumber(number);
	        if(sum==digitSum) {
	        	System.out.println("1");
	        }
	        else {
	        	System.out.println("0");
	        }
	        
	        scanner.close();
	    }
	public static long sumOfNumber(long n) {
		long sum=0;
		while(n>0) {
			long rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}
	    
	    public static long printPrimeFactors(long n) {
	    	long sum=0;
	        while (n % 2 == 0) {
	        	sum=sum+2;
	          
	            n /= 2;
	        }
	        
	        for (long i = 3; i <= n; i += 2) {
	            while (n % i == 0) {
	            	sum=sum+i;
	                
	                n /= i;
	            }
	        }
	        return sum;
	        
	        
	       
	    }
	}
	






	

