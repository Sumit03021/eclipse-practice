package assignment1;
import java.util.*;
public class fibonacciLadder {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int sum =a+b;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a=b;
				b=sum;
				sum=a+b;
			}
			System.out.println();
		}

	}

}
