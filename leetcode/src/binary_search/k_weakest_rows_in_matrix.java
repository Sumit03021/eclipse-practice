package binary_search;
import java.util.*;
public class k_weakest_rows_in_matrix {
public static int [] weakest(int [][]mat,int k) {
	int []arr=new int[k];
	int []cols=new int[mat.length];
	for(int i=0;i<mat.length;i++) {
		int s=0;int e=mat[i].length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(mat[i][mid]==0) {
				e=mid-1;
			}else {
				s=mid+1;
				cols[i]=s;
			}
		}
	}
	for(int i=0;i<mat.length;i++) {
		System.out.print(cols[i]+" ");
	}
	
	
	
	
	
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int [][]arr=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=s.nextInt();
	}
}
int k=s.nextInt();
int []result= weakest(arr, k);
//for(int i=0;i<k;i++) {
//	System.out.print(result[k]+" ");
//}
	}

}
