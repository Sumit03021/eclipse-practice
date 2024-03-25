package DP;

public class edit_distance {
	 public int helper(String str1, String str2,int i,int j,int [][]dp){
	        if(i==str1.length()){
	            return str2.length()-j;
	        }
	        if(j==str2.length()){
	            return str1.length()-i;
	        }
	        if(dp[i][j]!=-1){
	            return dp[i][j];
	        }
	        if(str1.charAt(i)==str2.charAt(j)){
	            return dp[i][j] = helper(str1,str2,i+1,j+1,dp);
	        }else{
	            int ans1 = helper(str1,str2,i+1,j+1,dp)+1;
	            int ans2 = helper(str1,str2,i+1,j,dp)+1;
	            int ans3 = helper(str1,str2,i,j+1,dp)+1;
	            return dp[i][j] = Math.min(ans1,Math.min(ans2,ans3));
	        }
	    }
	    public int minDistance(String word1, String word2) {
	        int n= word1.length();
	        int m=word2.length();
	        int [][]dp = new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                dp[i][j]=-1;
	            }
	        }
	        return helper(word1,word2,0,0,dp);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
