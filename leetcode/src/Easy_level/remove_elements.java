package Easy_level;
import java.util.*;
public class remove_elements {
public static int removeelement(int []nums,int val) {
	int count=nums.length;
	for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
			nums[i]='_';
			count--;
			}
		}
	
	Arrays.sort(nums);
	
//	for(int i=0;i<nums.length;i++) {
//		if(nums[i]=='_') {
//			count--;
//		}
//	}
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
int val=s.nextInt();
System.out.println(removeelement(arr,val));
	}
	}


