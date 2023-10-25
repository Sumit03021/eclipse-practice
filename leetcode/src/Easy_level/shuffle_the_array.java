package Easy_level;
import java.util.*;
public class shuffle_the_array {
public static int [] shuffle(int []nums,int n) {
	int []arr=new int[2*n];
	for(int i=0;i<2*n;i=i+2) {
		arr[i]=nums[i/2];
	}
	for(int i=1;i<2*n;i=i+2) {
		arr[i]=nums[n+((i-1)/2)];
	}
	return arr;
}// 0 1 2 3 4 5---n=3 ----
// 3-1,4-3,5-5 -----n-2,n-1,n-0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[2*n];
		for(int i=0;i<2*n;i++) {
			arr[i]=s.nextInt();
		}
		int []nums=shuffle(arr,n);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
	}
	}
}
