package Assignment_3;
import java.util.*;
public class array_bubblesort {
public static void bubblesort(int []arr) {
	for(int i=1;i<arr.length;i++) {
		for(int j=0; j<arr.length-i;j++) {
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
 Scanner s= new Scanner(System.in);
 int n=s.nextInt();
 int []arr=new int[n];
 for(int i=0;i<arr.length;i++) {
	 arr[i]=s.nextInt();
 }
 bubblesort(arr);
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }
	}

}
