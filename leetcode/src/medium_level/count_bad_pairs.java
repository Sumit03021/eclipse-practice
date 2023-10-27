package medium_level;

import java.util.Scanner;

public class count_bad_pairs {
	public static long countbadpairs(int []nums) {
	long count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if((j-i)!=(nums[j]-nums[i])) {
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
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(countbadpairs(arr));
	}

}
