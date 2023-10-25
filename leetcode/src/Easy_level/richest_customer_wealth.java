package Easy_level;
import java.util.*;
public class richest_customer_wealth {
public static int wealth(int [][]accounts) {
	int []sum=new int[accounts.length];
	int max=Integer.MIN_VALUE;
	for(int i=0;i<accounts.length;i++) {
		for(int j=0;j<accounts[i].length;j++) {
			sum[i]+=accounts[i][j];
		}
	}
	for(int i=0;i<sum.length;i++) {
		if(sum[i]>max) {
			max=sum[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int [][]arr=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=s.nextInt();
	}
}
System.out.println(wealth(arr));
	}
	}

