package Lecture_22;
import java.util.*;
public class twoD_array2 {
public static void display(int [][]arr) {
	// rows----arr.length cols----arr[i].length
	Scanner s=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
  int [][]array=new int[3][4];
  display(array);
	}
}
