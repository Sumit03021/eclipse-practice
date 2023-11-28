package greedy;
import java.util.*;
public class min_operations_to_strictly_increasing_array_ii {
	public static int minoperations(int []nums) {
	int count=0;
	if(nums.length==1) {
		return 0;
	}else {
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<=nums[i-1]) {
				count=count+nums[i-1]-nums[i]+1;
				nums[i]=nums[i-1]+1;
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
		System.out.println(minoperations(arr));
	}

}
