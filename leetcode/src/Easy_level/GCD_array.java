package Easy_level;
import java.util.*;
public class GCD_array {
public static int gcdinarray(int []nums) {
	int ans=-1;
	for(int i=0;i<nums.length-1;i++) {
	int min=Math.min(nums[i],nums[i+1]);
	 int max=Math.max(nums[i],nums[i+1]);

	int divisor=max/min;
	while(max>0) {
		int rem=max%min;
		max=min;
		min=rem;
	}	
	ans=divisor;
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
System.out.println(gcdinarray(arr));
	}

}
