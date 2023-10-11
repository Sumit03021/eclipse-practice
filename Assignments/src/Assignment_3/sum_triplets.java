package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class sum_triplets {
public static void sumtriplets(int []arr,int target) {
	for( int i=0;i<arr.length;i++) {
		for( int j=i;j<arr.length;j++) {
			for( int k=j;k<arr.length;k++) {
				if(arr[i]+arr[j]+arr[k]==target &&i!=j && j!=k && i!=k) {
		System.out.println(arr[i]+","+" "+arr[j]+" "+"and"+" "+arr[k]);
				}
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
Arrays.sort(arr);
int m=s.nextInt();
sumtriplets(arr,m);
	}

}
