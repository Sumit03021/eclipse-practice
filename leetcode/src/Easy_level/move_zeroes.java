package Easy_level;
import java.util.*;
public class move_zeroes {
public static void movezero(int []nums) {
	for(int j=0;j<nums.length;j++) {
		for(int i=0;i<nums.length-1;i++) {
		  if(nums[i]==0) {
			int temp=nums[i];
			nums[i]=nums[i+1];
			nums[i+1]=temp;
		}
	}
}
	System.out.print("[");
	for(int i=0;i<nums.length-1;i++) {
		System.out.print(nums[i]);
		System.out.print(",");
	}
	System.out.print(nums[nums.length-1]);
	System.out.print("]");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
movezero(arr);
	}

}
