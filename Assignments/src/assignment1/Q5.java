package assignment1;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=5;
		int nsp=n-1;
		int nst=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=nst;j++) {
				if(i==1 || i==5 ) {
				System.out.print("*");
			}
				 else if( j==1 || j==nst) {
					System.out.print("*");
				}
				 else {
					 System.out.print(" ");
				 }
			}
			nsp--;
			System.out.println();
		}
	}

}
