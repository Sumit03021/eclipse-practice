package Assignment_4;
import java.util.*;
public class rotate_image {
public static void rotateimage(int [][]arr){
	int mini=0;
	int maxi=arr.length-1;
	int minj=0;
	int maxj=arr[0].length-1;
	while(minj<=maxj) {
	for(int i=mini;i<=maxi;i++) {
		System.out.print(arr[i][maxj]+" ");
	}
	System.out.println();
	maxj--;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]arr= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
rotateimage(arr);
		
	}

}
