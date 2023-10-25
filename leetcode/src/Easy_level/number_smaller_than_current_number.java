package Easy_level;
import java.util.*;
public class number_smaller_than_current_number {
public static int [] numbersmallercurrent(int []nums) {
	int []current=new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums.length;j++) {
			if(nums[i]>nums[j] && j!=i) {
				current[i]++;
			}
		}
	}
	return current;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int []nums=numbersmallercurrent(arr);
for(int i=0;i<nums.length;i++) {
	System.out.print(nums[i]+" ");
}
	}

}
