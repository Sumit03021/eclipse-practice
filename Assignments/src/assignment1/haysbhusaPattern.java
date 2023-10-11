package assignment1;
import java.util.*;
public class haysbhusaPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nst=1;
		int nsp=n-1;
		int insp=-1;
		int i=1;
		while(i<=n) {
			int m=1;
			while(m<=nsp) {
				System.out.print("  ");
				m++;
			}
			int j=nst;
			while(j>=1) {
				System.out.print(j +" ");
				j--;
			}
			int k=1;
			while(k<=insp) {
				System.out.print("  ");
				k++;
			}
			int l=1;
			while(l<=nst) {
				if(i==1 || i==n) {
				}
				else {
					System.out.print(l +" ");
				}
				l++;
			}
			if(i<n/2+1) {
				nsp-=2;
				nst++;
				insp+=2;
			}
			else {
				nsp+=2;
				nst--;
				insp-=2;
			
			}
			i++;
			System.out.println();
		}
		
		
		
	}

	}


