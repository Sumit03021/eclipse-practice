package Tabulation;
import java.util.*;
public class climb_stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int []dp =new int[n+1];
dp[0]=1;
dp[1]=1;
for(int i=2;i<dp.length;i++) {
	dp[i]= dp[i-1] + dp[i-2];
}
System.out.println(dp[n]);
	}

}
