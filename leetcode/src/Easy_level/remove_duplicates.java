package Easy_level;
import java.util.*;
public class remove_duplicates {
public static int removeduplicate(int []nums) {
	int count=nums.length;// valid for any value but _---95 ans. check
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length-1;j++) {
			if(nums[i]==nums[j+1]) {
			nums[j+1]='_';	
			}
		}
	}
	Arrays.sort(nums);
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==95 && nums[i+1]>95) {
			int temp=nums[i];
			nums[i]=nums[i+1];
			nums[i+1]=temp;
		}
	}
	for(int i=0;i<nums.length;i++) {
		if(nums[i]=='_') {
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
