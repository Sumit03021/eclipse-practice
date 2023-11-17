package arrays;
import java.util.*;
public class number_strictly_smalleer_and_greater {
public static int numberofelements(int []nums) {
	Arrays.sort(nums);
	int count1=0;
	int count2=0;
	if(nums[0]!=nums[nums.length-1]) {
	for(int i=0;i<nums.length;i++) {
		if(nums[0]==nums[i]) {
			count1++;
		}else if(nums[nums.length-1]==nums[i]) {
			count2++;
		}
	}
	}else {
		for(int i=0;i<nums.length;i++) {
			if(nums[0]==nums[i]) {
				count1++;
			}
		}
	}
	int count=nums.length-count1-count2;
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
System.out.println(numberofelements(arr));
	}

}
