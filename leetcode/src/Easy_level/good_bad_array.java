package Easy_level;

import java.util.*;

public class good_bad_array {
public static boolean isbad(int []nums) {
	Arrays.sort(nums);
int count=0;
int countmax=0;
int n=nums.length;
int []news=new int[n];
int ans=0;
for(int i=0;i<nums.length-2;i++) {
	news[i]=nums[i];
}
for(int i=0;i<nums.length-1;i++) {
	ans=Math.max(nums[i],nums[i+1]);
}
news[(n-2)%n]=nums[(n-2)%n];
news[n-1]=ans;
for(int i=0;i<nums.length-2;i++) {
	if(news[i]==nums[i] && nums[i]!=nums[i+1]) {
		count++;
	}
}
if(news[(n-2)%n]==news[n-1]) {
	countmax+=2;
}
   if(count==n-2 && countmax==2 && n==ans+1) {
	   return true;
   }
   return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
System.out.println(isbad(arr));
}

}
