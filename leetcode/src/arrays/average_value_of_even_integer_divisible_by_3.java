package arrays;
import java.util.*;
public class average_value_of_even_integer_divisible_by_3 {
public static int averagevalue(int []nums) {
	int sum=0;
	int count=0;
	for(int i=0;i<nums.length;i++) {
	if(nums[i]%6==0) {
		sum=sum+nums[i];
		count++;
	}
	}
	if(count>0) {
		sum=Math.floorDiv(sum, count);
		return sum;
	}else {
		return 0;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(averagevalue(arr));
	}

}
