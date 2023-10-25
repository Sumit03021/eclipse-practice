package Assignment_4;

import java.util.*;

public class wave_row_wise {
	public static void wavearray(int [][]array) {
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				for(int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]+", ");
				}
			}else {
				for(int j=array[i].length-1;j>=0;j--) {
					System.out.print(array[i][j]+", ");
				}

			}
		}
			System.out.print("END");
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	 int [][]arr=new int[m][n];
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 arr[i][j]=s.nextInt();
		 }
	 }
	 wavearray(arr);

	}

}
