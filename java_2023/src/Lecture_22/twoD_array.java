package Lecture_22;
import java.util.*;
public class twoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int []arr -----reference var
// new int[n]------ 1d array
// int [] []arr------refernce var
// new int[n][m]-------- 2d array
// new int [n][]------null (default) address
// new int [m][n]----m+1 1d array
		
// how to take input---------
		Scanner s=new Scanner(System.in);
		int [][]arr=new int[3][4];
		for(int i=0;i<3;i++) { // loop for rows 
			for(int j=0;j<4;j++) { // loop for columns
				arr[i][j]= s.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");;
			}
			System.out.println();
		}
	}
}
