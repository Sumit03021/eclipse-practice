package Easy_level;

import java.util.Scanner;

public class matrix_diagonal_sum {
	public static int diagonalsum(int [][]mat) {
	int sum=0;
	int n=mat.length;
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[0].length;j++) {
			if(i==j || i+j==mat.length-1) {
				sum=sum+mat[i][j];
			}
		}
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for( int j=0;j<n;j++) {
			arr[i][j]=s.nextInt();
		}
		}
		System.out.println(diagonalsum(arr));
	}

}
