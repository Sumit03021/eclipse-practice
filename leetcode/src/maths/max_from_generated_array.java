package maths;
import java.util.*;
public class max_from_generated_array {
public static int maxgenerate(int n) {
	int []arr=new int[n+1];
	arr[0]=0;
	arr[1]=1;
	int max=Integer.MIN_VALUE;
	if(n%2!=0) {
	for(int i=1;i<(n+1)/2;i++) {
		arr[2*i]=arr[i];
		arr[2*i+1]=arr[i]+arr[i+1];
	}
	}else {
		for(int i=1;i<(n)/2;i++) {
			arr[2*i]=arr[i];
			arr[2*i+1]=arr[i]+arr[i+1];
		}
		arr[n]=arr[n/2];
	}
	for(int i=0;i<n+1;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	System.out.println(maxgenerate(n));	
	}

}
