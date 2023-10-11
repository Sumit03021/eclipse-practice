package assignment1;
import java.util.Scanner;
public class RightButterflyOfnumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nst=11;//2*n+1;
		int num=5;
		int nsp=0;
		int i=1;
		while(i<=2*n+1) {
			int j=1;
			while(j<=nst) {
				if(j<nst/2+1) {
				System.out.print(num+" ");
				num--;
				}
				else {
					
					System.out.print(num +" ");
					num++;
				}
				j++;
			}
			if(i<(2*n+1)/2+1) {
			nst-=2;
			num-=2;
			}
			else {
				nst+=2;
				num=-1;
				num+=2;
			}
			i++;
			System.out.println();
		}
		
		}
		

	}


