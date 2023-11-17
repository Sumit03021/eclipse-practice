package binary_search;
import java.util.*;
public class search_insert_position {
public static int searchindex(int []nums,int target) {
	int low=0;
	int high=nums.length-1;
	int ans=-1;
	while(low<=high) {
		int mid =(low+high)/2;
		if(nums[mid]==target) {
			ans=mid;
			return ans;
		}else if(nums[mid]>target) {
			high=mid-1;
			ans=high+1;
		}else {
			low=mid+1;
			ans=low;
		}
	}
	return ans;
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
System.out.println(searchindex(nums,target));
	}

}
