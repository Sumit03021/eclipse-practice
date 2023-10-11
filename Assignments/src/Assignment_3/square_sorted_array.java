package Assignment_3;
import java.util.*;
public class square_sorted_array {
public static int [] squarearr(int []arr) {
	int []sqarr=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		sqarr[i]=arr[i]*arr[i];
	}
	return sqarr;
}
public static void sortedSquare(int []arr) {
	for(int i=1;i<arr.length;i++) {
		for(int j=0;j<arr.length-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
int []sqarr=squarearr(arr);
sortedSquare(sqarr);
for(int i=0;i<sqarr.length;i++) {
	System.out.print(sqarr[i]+" ");
}
	}

}
