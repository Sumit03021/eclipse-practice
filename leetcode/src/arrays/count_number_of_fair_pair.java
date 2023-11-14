package arrays;
import java.util.*;
public class count_number_of_fair_pair {
public static long countnumber(int []nums,int lower,int upper) {
	long count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			long ans=nums[i]+nums[j];
			if(ans>=lower && ans<=upper) {
				count++;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int lower=s.nextInt();
int upper=s.nextInt();
int n=s.nextInt();
int []nums=new int[n];
for(int i=0;i<n;i++) {
	nums[i]=s.nextInt();
}
System.out.println(countnumber(nums,lower,upper));
	}

}
