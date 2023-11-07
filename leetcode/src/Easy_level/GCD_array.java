package Easy_level;
import java.util.*;
public class GCD_array {
public static int gcdinarray(int []nums) {
	Arrays.sort(nums);
	int max=nums[nums.length-1];
	int min=nums[0];
int ans=-1;
	int divisor=max/min;
		int rem=max%min;
		max=min;
		min=rem;
	ans=divisor;
	
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
System.out.println(gcdinarray(arr));
	}

}
