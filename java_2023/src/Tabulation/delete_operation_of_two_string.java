package Tabulation;

public class delete_operation_of_two_string {
	public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m= text2.length();
        int [][]dp = new int[n][m];
        for(int i=0;i<dp.length;i++){
         for(int j=0;j<dp[i].length;j++){
             if(i==0 && j==0){
                 if(text1.charAt(i)==text2.charAt(j)){
                     dp[i][j]=1;
                 }else{
                     dp[i][j]=0;
                 }
             }else if(i==0){
                  if(text1.charAt(i)==text2.charAt(j)){
                     dp[i][j]=1;
                 }else{
                     dp[i][j]=dp[i][j-1];
                 }
             }else if(j==0){
                  if(text1.charAt(i)==text2.charAt(j)){
                     dp[i][j]=1;
                 }else{
                     dp[i][j]=dp[i-1][j];
                 }
             }else{
             if(text1.charAt(i)==text2.charAt(j)){
               dp[i][j]= 1 + dp[i-1][j-1];
             }else{
                 dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
             }
             }
         }
     }
     return dp[n-1][m-1];
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int ans = longestCommonSubsequence(word1, word2);
        int ans1 = n- ans;
        int ans2 = m-ans;
        return ans1 + ans2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
