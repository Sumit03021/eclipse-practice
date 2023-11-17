package binary_search;
import java.util.*;
public class binary_search {
public static int search(int []nums,int target) {
	int low=0;
	int high=nums.length-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(nums[mid]==target) {
			return mid;
		}else if(nums[mid]>target) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []nums=new int[n];
for(int i=0;i<n;i++) {
	nums[i]=s.nextInt();
}
int target=s.nextInt();
System.out.println(search(nums,target));
	}

}
