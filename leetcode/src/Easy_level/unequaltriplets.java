package Easy_level;

import java.util.*;

public class unequaltriplets {
	public static int unequaltriplets(int []nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				for(int k=j;k<nums.length;k++) {
					if(nums[k]!=nums[j] && nums[j]!=nums[i]&& nums[i]!=nums[k] && i!=j && k!=j) {
					count++;	
					}
				}
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
	System.out.println(unequaltriplets(arr));
	
	}

}
