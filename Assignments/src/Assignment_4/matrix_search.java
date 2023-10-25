package Assignment_4;
import java.util.*;
public class matrix_search {
public static int matrixsearch(int [][]arr,int target) {
	int i=0;
	int j=arr[0].length-1;
	while(j>=0 && i<arr.length) {
		if(arr[i][j]>target) {
			j--;
		}else if(arr[i][j]<target) {
			i++;
		}else {
			return 1;
		}
	}
	return 0;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int [][]arr= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int target=s.nextInt();
		System.out.println(matrixsearch(arr,target));
}
}