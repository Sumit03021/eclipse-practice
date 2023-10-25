package Easy_level;
import java.util.*;
public class build_array_from_permutation {
public static int [] array(int []nums) {
	int []arr=new int[nums.length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=nums[nums[i]];
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
int []nums=array(arr);
for(int i=0;i<nums.length;i++) {
	System.out.print(nums[i]+" ");
}
	}

}
