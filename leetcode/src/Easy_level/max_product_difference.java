package Easy_level;
import java.util.*;
public class max_product_difference {
public static int maxproductdiff(int []nums) {
	int n=nums.length;
	int product=0;
	Arrays.sort(nums);
	for(int w=0;w<n;w++) {
		 product=nums[n-2]*nums[n-1]-nums[1]*nums[0];
		}
		 
	
	return product;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(maxproductdiff(arr));
	}

}
