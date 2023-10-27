package Easy_level;

import java.util.*;

public class goodtriplets {
	public static int goodtriplets(int []arr,int a,int b,int c) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=j;k<arr.length;k++) {
					if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[i]-arr[k])<=c && i!=j && k!=j) {
					count++;	
					}
				}
			}
		}
		return count;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	System.out.println(goodtriplets(arr,a,b,c));

	}

}
