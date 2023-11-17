package binary_search;
import java.util.*;
public class max_negative_and_positive_number {
public static int maxcount(int []nums) {
   int count1=0;
   int count2=0;
	for(int i=0;i<nums.length;i++) {
	   if(nums[i]>0) {
		   count1++;
	   }else if(nums[i]<0) {
		   count2++;
	   }
   }
	return Math.max(count1, count2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []num1=new int[n];
		for(int i=0;i<n;i++) {
			num1[i]=s.nextInt();
		}
		System.out.println(maxcount(num1));
	}

}
