package assignment2;
import java.util.*;
public class oddAndEven {
	public static long sumOfDigits(long n) {
		long sumOfEven=0,i=1,sumOfOdd=0;
		while(n>0) {
			long rem =n%10;
			n=n/10;
			if(rem%2==0) {
				sumOfEven=rem+sumOfEven;
			}
			else {
				sumOfOdd=rem+sumOfOdd;
			}
		}
		if(sumOfEven%4==0 ||sumOfOdd%3==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
        public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
		long sum=sumOfDigits(arr[i]);
		if(sum==1) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
		

	}

}
