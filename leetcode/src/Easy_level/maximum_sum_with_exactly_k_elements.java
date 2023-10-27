package Easy_level;
import java.util.*;
public class maximum_sum_with_exactly_k_elements {
public static int maxscore(int []nums,int k) {
	int sum=0;
	Arrays.sort(nums);
	int n=nums.length;
	for(int i=0;i<k;i++) {
		sum=sum+nums[n-1];
		nums[n-1]++;
		}
	
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for( int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int k=s.nextInt();
System.out.println(maxscore(arr,k));
	}

}
