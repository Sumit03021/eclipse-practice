package Assignment_4;
import java.util.*;
public class spiral_print {
	public static void spiralarray(int [][]arr) {
		int mini=0;
		int maxj=arr[0].length-1;
		int maxi=arr.length-1;
		int minj=0;
		int count=0;
		int total=arr.length*arr[0].length;
		while(count<total) {
			for(int i=minj;count<total && i<=maxj;i++) {
				System.out.print(arr[mini][i]+", ");
				count++;
			}
			mini++;
			for(int j=mini;count<total && j<=maxi;j++) {
				System.out.print(arr[j][maxj]+", ");
				count++;
			}
			maxj--;
			for(int i=maxj;count<total && i>=minj;i--) {
				System.out.print(arr[maxi][i]+", ");
				count++;
			}
			maxi--;
			for(int j=maxi;count<total && j>=mini;j--) {
				System.out.print(arr[j][minj]+", ");
				count++;
			}
			minj++;
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
