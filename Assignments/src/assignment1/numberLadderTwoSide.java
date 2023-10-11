package assignment1;
import java.util.*;
public class numberLadderTwoSide {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int nsp=2*n-3;
		int col=1;
		while(i<=n) {
			int j=1;
			while(j<=col) {
				System.out.print(j +" ");
				j++;
			}
			int k=1;
			while(k<=nsp) {
				System.out.print("  ");
				k++;
			}
			int l=col;
			while(l>=1) {
				if(i==n && l==col) {
				l--;	
				}
				System.out.print(l+" ");
				l--;
			}
			
			i++;
			col++;
			nsp-=2;
			System.out.println();
		}

	}

}
