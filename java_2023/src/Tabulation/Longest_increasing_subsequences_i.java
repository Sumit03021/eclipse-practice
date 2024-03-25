package Tabulation;
import java.util.*;
public class Longest_increasing_subsequences_i {
	public static int lengthOfLIS(int[] nums) {
        int []dp =new int[nums.length];
        int ans=-1;
    //dp[i]= store value of longest subsequences of ending at index i.
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
         for(int j=0;j<i;j++){
             if(nums[j]<nums[i]){
                 dp[i]=Math.max(dp[j]+1,dp[i]);
             }
         }
         ans= Math.max(dp[i],ans);
        }
        return ans;
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
