package assignment1;
import java.util.*;
public class diamondNumberPattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int col=1;
		int nsp=n-1;
		int i=1;
		
		while(i<=2*n-1) {
			int k=1;
			while(k<=nsp) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			int m=1;
			int p=i+1;
			while( j<=2*col-1) {
				if(j<=(2*col-1)/2 +1) {
				System.out.print(i+m-1 +" ");
				
				m++;
				}
				else {
					
				//int p=2*i;
				System.out.print(p +" ");
				p--;
				}
				j++;
				
			}
			
			if(i<n) {
			col++;
			nsp--;
			}
			else {
			col--;
			nsp++;
			}
			i++;
			System.out.println();
			}
			
		}

	}


