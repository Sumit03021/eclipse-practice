package Easy_level;
import java.util.*;
public class max_product_of_two_element {
public static int maxproduct(int []nums) {
	int val=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums.length;j++) {
			val=(nums[i]-1)*(nums[j]-1);
			if(max<val && i!=j) {
				max=val;
			}
		}
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
System.out.print(maxproduct(arr));
	}

}
