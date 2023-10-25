package Easy_level;
import java.util.*;
public class left_and_right_sum_differences {
public static int [] leftrightsumdiff(int []nums) {
	int []leftsum=new int[nums.length];
	int[]rightsum=new int[nums.length];
	int []diff=new int[nums.length];
	leftsum[0]=0;
	rightsum[nums.length-1]=0;
	for(int i=0;i<nums.length-1;i++) {
		leftsum[i+1]=leftsum[i]+nums[i];
	} 
	for(int i=nums.length-1;i>=1;i--) {
		rightsum[i-1]=rightsum[i]+nums[i];
	}
	for(int i=0;i<nums.length;i++) {
		diff[i]=Math.abs(leftsum[i]-rightsum[i]);
	}
	return diff;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
	int []diffsum=leftrightsumdiff(arr);
	for(int i=0;i<diffsum.length;i++) {
		System.out.print(diffsum[i]+" ");
	}
	}

}
