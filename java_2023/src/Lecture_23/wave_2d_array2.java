package Lecture_23;
import java.util.*;
public class wave_2d_array2 {
public static void wavearray(int [][]array) {
	for(int i=0;i<array.length;i++) {
		if(i%2==0) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
		}else {
			for(int j=array[i].length-1;j>=0;j--) {
				System.out.print(array[i][j]+" ");
			}

		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
 int [][]arr=new int[4][4];
 for(int i=0;i<arr.length;i++) {
	 for(int j=0;j<arr[i].length;j++) {
		 arr[i][j]=s.nextInt();
	 }
 }
 wavearray(arr);
	}

}
