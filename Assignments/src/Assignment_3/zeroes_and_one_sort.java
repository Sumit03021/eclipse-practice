package Assignment_3;

import java.util.*;
// 0 and 1
public class zeroes_and_one_sort {
public static int minIndex(int []arr,int s,int e) {
		int min=arr[s];
		int index=s;
		for(int i=s;i<=e;i++) {
			if(min>arr[i]) {
				min=arr[i];
				index=i;
			}
		}
		return index;
	}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int min_index=minIndex(arr,i,arr.length-1);
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
