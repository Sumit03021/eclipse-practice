package assignment1;
import java.util.*;
public class check {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nst=1;
		int p=n-2;
		int nsp=n-1;
		int i=1;
		while(i<=2*n-1) {
			int j=1;
			while(j<=nsp) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			int num1=i;
			if(i>(2*n-1)/2+1){
				num1=2*n-i;
			}
			while(k<=nst) {
				System.out.print(num1+" ");
				num1++;
				k++;
			}
			
			////////
			int l=2;
			int num2=2*(i-1);
			if(i>(2*n-1)/2+1){
				
				num2=2*p+2;
			}
			while(l<=nst) {
				System.out.print(num2+" ");
				num2--;
				l++;
			}
			if(i<(2*n-1)/2+1) {
				nst++;
				nsp--;
			}
			else {
				nst--;
				nsp++;
				p--;
			}
			System.out.println();
			i++;
			
		}
	}
}

	


