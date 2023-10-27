package Easy_level;
import java.util.*;
public class count_equal_and_divisible_pairs {
public static int countpairs(int []nums,int k) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]==nums[j] && (i*j)%k==0) {
			count++;	
			}
		}
	}
	return count;
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
System.out.println(countpairs(arr,k));
	}

}
