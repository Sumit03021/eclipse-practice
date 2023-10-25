package Easy_level;
import java.util.*;
public class two_sum {
public static int [] twosum(int []nums,int target) {
	int []arr=new int[2];
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length-1;j++) {
			if(nums[i]+nums[j+1]==target) {
			 arr[0]=i;
			 arr[1]=j+1;
			}
		}
	}
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int m=s.nextInt();
int []news=twosum(arr,m);
for(int i=0;i<2;i++) {
	System.out.println(news[i]);
}
	}

}
