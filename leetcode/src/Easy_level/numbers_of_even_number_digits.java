package Easy_level;
import java.util.*;
public class numbers_of_even_number_digits {
public static int evendigits(int []nums) {
	int []count=new int[nums.length];
	int counts=0;
	for(int i=0;i<nums.length;i++) {
		while(nums[i]>0) {
			nums[i]=nums[i]/10;
			count[i]++;
		}
		if(count[i]%2==0) {
			counts++;
		}
	}
	
	return counts;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(evendigits(arr));
	}

}
