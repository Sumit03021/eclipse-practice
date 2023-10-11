package Assignment_3;
import java.util.*;
public class pair_roses {
	public static int min(int []arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for( int j=i;j<arr.length;j++) {
				if(min>arr[j]-arr[i] && j!=i) {
					min=arr[j]-arr[i];
				}
			}
		}
		return min;
	}
public static void pairroses(int []arr,int target) {
	int min=min(arr);
for(int i=0;i<arr.length;i++) {
for( int j=i;j<arr.length;j++) {
if(arr[i]+arr[j]==target && arr[j]-arr[i]==min &&j!=i) {
System.out.println("Deepak should buy roses whose prices are "+arr[i]+" and "+arr[j]+".");
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
for(int j=0;j<t;j++) {
	int n=s.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	int m=s.nextInt();
	pairroses(arr,m);
}
	}
}
