package assignment1;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nst=1;
		int nsp =n-1;
		int m=0;
		int i=1;
		while(i<=2*n-1) {
			int l=nsp;
			while(l>=1) {
			System.out.print("  ");
			l--;
			}
		
		int j=0;
		int num1=i;
		if(i>(2*n-1)/2+1) {
			num1=2*n-i;
		}
		while(j<nst) {
			System.out.print(num1+" ");
			j++;
			num1++;
		}
		int k=0;
	int num =2*(i-1);
	if(i>(2*n-1)/2+1) {
		
		num=i-2*m;
	}
		while(k<nst-1) {
			System.out.print(num+" ");
			num--;
			k++;
	
		}
		if(i<(2*n-1)/2+1) {
		nsp--;
		nst++;
		}
		else {
			nsp++;
			nst--;
			m++;
		}
		System.out.println();
		i++;
		
		}
		

	}

}
