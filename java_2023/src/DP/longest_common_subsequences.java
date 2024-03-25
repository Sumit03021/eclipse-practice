package DP;
import java.util.*;
public class longest_common_subsequences {
	public int helper(int i,int j,String str1 , String str2,int [][]dp){
	     if(i==str1.length() || j==str2.length()){
	         return 0;
	     }
	     if(dp[i][j]!=-1){
	         return dp[i][j];
	     }
	     if(str1.charAt(i)==str2.charAt(j)){
	         int mera_ans = 1+ helper(i+1,j+1,str1,str2,dp);
	         return dp[i][j] = mera_ans;
	     }else{
	         int chota_ans1 = helper(i+1,j,str1,str2,dp);
	         int chota_ans2 = helper(i,j+1,str1,str2,dp);
	         int mera_ans = Math.max(chota_ans1,chota_ans2);
	         return dp[i][j] = mera_ans;
	     }
	    }
	    public int longestCommonSubsequence(String text1, String text2) {
	        int n =text1.length();
	        int m = text2.length();
	        int [][]dp = new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                dp[i][j]=-1;
	            }
	        }
	        return helper(0,0,text1,text2,dp);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

	}

}
