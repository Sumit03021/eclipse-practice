package Tabulation;
import java.util.*;
public class house_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int []nums =new int[n];
int []dp = new int[n+1];
for(int i=0;i<n;i++) {
	nums[i]=s.nextInt();
}
dp[n]=0;
dp[n-1]=nums[n-1];
for(int i=0;i<dp.length-2;i++) {
	dp[i]= Math.max(dp[i+1],dp[i+2]);
}
	}

}
