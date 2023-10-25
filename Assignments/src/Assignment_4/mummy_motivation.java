package Assignment_4;
import java.util.*;
public class mummy_motivation {
public static boolean motivation(int [][]arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]!=0 && i<j) {
				return false;
			}
		}
	}
	return true;
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
		System.out.println(motivation(arr));
	}

}
