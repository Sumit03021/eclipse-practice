package Assignment_3;
import java.util.*;
public class calculate_sum_ii {
	public static void circulararray(int []arr,int x) {
		int n=arr.length;
		int []newarr=new int[n];
		for(int i=0;i<n;i++) {
			newarr[i]=arr[i]+arr[(n-x+i)%n];
		}
		for( int i=0;i<n;i++) {
			arr[i]=newarr[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		  int m=s.nextInt();
		  for(int i=0;i<m;i++) {
			 int q=s.nextInt(); 
			 circulararray(arr,q);
		  }
		  int sum=0;
		  for(int j=0;j<n;j++) {
			 sum=sum + arr[j];
		  }
		  System.out.println(sum);
	}

}
