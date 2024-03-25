package Tabulation;

import java.util.*;
//dp[i]= store minimum ending value i length increasing subsequences.
public class Longest_subsequences_increasing_ii {
	public static int BinarySearch(int []dp,int val) {
		int low=1;
		int high=dp.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(high+low)/2;
			if(dp[mid]>=val) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
public static int lengthOfLIS(int []nums) {
	int n= nums.length;
	int []dp=new int[n+1];
	Arrays.fill(dp,Integer.MAX_VALUE);
	for(int i=0;i<n;i++) {
		int index =BinarySearch(dp,nums[i]);
		dp[index]=nums[i];
	}
	for(int i=dp.length-1;i>=1;i--) {
		if(dp[i]!=Integer.MAX_VALUE) {
			return i;
		}
	}
	return 1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(lengthOfLIS(arr));
	}

}
