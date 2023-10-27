package Easy_level;
import java.util.*;
public class max_value_ordered_triplets {
	public static long maxtripletsvalue(int []nums) {
		long max=Long.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length-1;k++) {
					long ans=(nums[i]-nums[j])*nums[k];
					if(max<ans) {
						max=ans;
					}
				}
			}
		}
		if(max<0) {
			max=0;
		}
		return max;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	System.out.println(maxtripletsvalue(arr));
	

	}

}
