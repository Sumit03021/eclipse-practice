package Assignment_4;

import java.util.*;

public class rowwise_sort {
public static void rowwisesort(int [][]arr) {
	for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr[i]);
			}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");;
		}
		System.out.println();
	}
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
		rowwisesort(arr);
	}

}
