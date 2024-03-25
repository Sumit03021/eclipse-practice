package Tabulation;
import java.util.*;
public class Longest_size_subarray_alternative_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//dp[i] = store ending at the index of i.
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int []dp = new int[n+1];
		dp[0]=1;
		int ans =-1;
		for(int i=1;i<n;i++) {
			if(arr[i]*arr[i-1]<0) {
				dp[i]= dp[i-1]+1;
			}else {
				dp[i]=1;
			}
			ans = Math.max(ans,dp[i]);
		}
		
		System.out.println(ans);
	}

}
