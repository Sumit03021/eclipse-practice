package assignment2;
import java.util.*;
public class patternMagic {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=n;
		int nsp=-1;
		int i=1;
		while(i<=2*n-1) {
			int j=1;
			while(j<=nst) {
				System.out.print("*");
				j++;
			}
			
			
			int k=1;
			
			while(k<=nsp) {
						
				System.out.print(" ");
				k++;
			}
			int l=1;
			if(i==1 || i==2*n-1) {
				l=2;
			}	
			while(l<=nst) {
				System.out.print("*");
				l++;
			}
			if(i<(2*n-1)/2+1) {
				nst--;
				nsp+=2;
			}
			else {
				nst++;
				nsp-=2;
				
			}
			i++;
			System.out.println();
		}
		 

	}

}
