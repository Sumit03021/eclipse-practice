package Tabulation;
import java.util.*;
public class longest_common_subsequences {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

	}

}
