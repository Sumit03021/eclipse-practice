package Assignment_4;
import java.util.*;
public class wave_columns_wise {

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
		
		for(int j=0;j<arr[0].length;j++) {
			if(j%2==0) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]+", ");
			}
			}else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
		System.out.print("END");
	}

}
