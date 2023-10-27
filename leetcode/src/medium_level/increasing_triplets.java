package medium_level;

import java.util.Scanner;

public class increasing_triplets {
	public static boolean increasingtriplets(int []nums) {
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length;j++) {
			for(int k=j;k<nums.length;k++) {
				if(nums[i]<nums[j] && nums[j]<nums[k] && i!=j && j!=k ) {
				return true;	
				}
			
		}
	}
	}
	return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(increasingtriplets(arr));
	}

}
