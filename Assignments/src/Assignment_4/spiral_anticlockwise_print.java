package Assignment_4;

import java.util.*;

public class spiral_anticlockwise_print {
	public static void spiralarray(int [][]arr) {
		int mini=0;
		int maxj=arr[0].length-1;
		int maxi=arr.length-1;
		int minj=0;
		int count=0;
		int total=arr.length*arr[0].length;
		while(count<total) {
			for(int i=mini;count<total && i<=maxi;i++) {
				System.out.print(arr[i][minj]+", ");
				count++;
			}
			minj++;
			for(int j=minj;count<total && j<=maxj;j++) {
				System.out.print(arr[maxi][j]+", ");
				count++;
			}
			maxi--;
			for(int i=maxi;count<total && i>=mini;i--) {
				System.out.print(arr[i][maxj]+", ");
				count++;
			}
			maxj--;
			for(int j=maxj;count<total && j>=minj;j--) {
				System.out.print(arr[mini][j]+", ");
				count++;
			}
			mini++;
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int [][]arr= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		spiralarray(arr);
	

	}

}
