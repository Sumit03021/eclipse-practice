package assignment1;

import java.util.Scanner;


public class NumberButterfly {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=5;
		int col=1;
		int num1=5;
		int num2=5;
		int i=1;
		int nsp=2*n-1;
		while(i<=2*n+1) {
			int j=1;
			while(j<=col) {
				System.out.print(num1-j+1 +" ");
				j++;
			}
			int k=1;
			while(k<=nsp) {
				System.out.print(" "+" ");
				k++;
			}
			int l=0;
			if(i==n+1) {
				l=1;
			}
			while(l<col) {
				
			System.out.print(num2+l+" ");
				l++;
			}
			if(i<(2*n+1)/2+1) {
				col++;
				nsp-=2;
				num2--;
			}
			else {
				col--;
				nsp+=2;
				num2++;
			}
			i++;
			System.out.println();
		}
				

	}

}
