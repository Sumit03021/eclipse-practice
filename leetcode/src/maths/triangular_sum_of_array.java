package maths;
import java.util.*;
public class triangular_sum_of_array {
public static int triangularsum(int []nums) {
	int n=nums.length;
	int i=0;
	int ans=-1;
	while(n-i>=1) {
		int []newnums=new int[n-i];
		for(int j=0;j<n-1;j++) {
			newnums[j]=(nums[j]+nums[j+1])%10;
		}
		for(int j=0;j<n-i-2;j++) {
			newnums[j]=(newnums[j]+newnums[j+1])%10;
		}
		i++;
		System.out.println(newnums[0]);
		ans=newnums[0];
	}
return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(triangularsum(arr));
	}

}
