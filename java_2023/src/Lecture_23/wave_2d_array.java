package Lecture_23;
import java.util.*;
public class wave_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
int [][]arr=new int[4][4];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=s.nextInt();
	}
}
	for(int i=0;i<arr.length;i++) {
		if(i%2!=0) {    
			int k=0;
			int m=arr[i].length-1;
			while(k<=m) {
				int temp=arr[i][k];
				arr[i][k]=arr[i][m];
				arr[i][m]=temp;
				k++;
				m--;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
	}
}
	}


