package Easy_level;
import java.util.*;
public class diff_element_and_digit_sum {
public static int differenceofsum(int []nums) {
	int digitsum=0;
	int elementsum=0;
	for(int i=0;i<nums.length;i++) {
	elementsum=elementsum+nums[i];
		while(nums[i]>0) {
		int ld=nums[i]%10;
		digitsum=digitsum+ld;
		nums[i]=nums[i]/10;
	}
	}
	int ans = elementsum-digitsum;
	if(ans<0) {
		ans = -ans;
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(differenceofsum(arr));
	}

}
