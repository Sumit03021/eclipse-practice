package Easy_level;
import java.util.*;
public class apply_operations_in_arrays {
	public static int [] applyoperations(int []nums) {
	for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
			 nums[i]=nums[i]*2;
			 nums[i+1]=0;
			}
		}
	for(int j=0;j<nums.length;j++) {
			for(int i=0;i<nums.length-1;i++) {
		if(nums[i]==0) {
			int temp=nums[i];
			nums[i]=nums[i+1];
			nums[i+1]=temp;
		}
	}
	}
	return nums;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int[]nums=applyoperations(arr);
for(int i=0;i<nums.length;i++) {
	System.out.print(nums[i]+" ");
}
	

	}

}
