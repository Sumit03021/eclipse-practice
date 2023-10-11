package assignment1;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	int nst= n/2+1;
	int nsp =-1;
	int i=1;
	//if(n%2==1 ) {
	while(i<=n) {
		int j=1;
		while(j<=nst) {
			System.out.print("* ");
			j++;
		}
		int k=1;
		while(k<=nsp) {
			System.out.print("  ");
			k++;
		}
		int l=1;
		if(i==1 ||i==n) {
			l=2;
		}
		while(l<=nst) {
			System.out.print("* ");
			l++;
		}
		if(i<n/2+1) {
			nst--;
			nsp+=2;
		}
		else {
			nst++;
			nsp-=2;
		}
		System.out.println();
		i++;
	}
	}
	
	
}

//}


