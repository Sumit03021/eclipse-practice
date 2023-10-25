package medium_level;
import java.util.*;

public class remove_duplicates_ii {
	public static int removeduplicate(int []nums) {
	int count=nums.length;
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length;j++) {
			for(int k=j;k<nums.length;k++) {
			if(nums[i]==nums[j] && nums[i]==nums[k] && nums[j]==nums[k] &&i!=j && j!=k && i!=k) {
			nums[k]=20000;	
			}
		}
	}
	}
	Arrays.sort(nums);
//	for(int i=0;i<nums.length;i++) {
//		if(nums[i]==95 && nums[i+1]>95) {
//			int temp=nums[i];
//			nums[i]=nums[i+1];
//			nums[i+1]=temp;
//		}
//	}
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==20000) {
			count--;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(removeduplicate(arr));

	}

}
