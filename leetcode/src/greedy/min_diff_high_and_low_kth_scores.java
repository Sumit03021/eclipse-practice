package greedy;
import java.util.*;
public class min_diff_high_and_low_kth_scores {
public static int mindiff(int []nums,int k) {
	Arrays.sort(nums);
	int min=Integer.MAX_VALUE;
	if(k==1) {
		return 0;
	}else {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(min>nums[j]-nums[i] && j-i==k-1) {
					min=nums[j]-nums[i];
				}
			}
		}
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		System.out.println(mindiff(arr,k));
	}

}
