package Lecture_22;

import java.util.Scanner;

public class twoD_array_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int [][]arr=new int[3][4];
		for(int i=0;i<3;i++) { // loop for rows 
			for(int j=0;j<4;j++) { // loop for columns
				arr[i][j]= s.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=0;j<4;j++) {
			if(arr[i][j] < min) {
				min=arr[i][j];
			}
		}
			System.out.println(min);
	}
	}
}
