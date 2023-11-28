package greedy;
import java.util.*;
public class array_partition {
public static int maxsum(int []nums) {
	Arrays.sort(nums);
	int sum=0;
	for(int i=0;i<nums.length;i=i+2) {
		sum=sum+nums[i];
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(maxsum(arr));
	}

}
