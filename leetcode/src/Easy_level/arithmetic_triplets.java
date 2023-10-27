package Easy_level;
import java.util.*;
public class arithmetic_triplets {
public static int arithmetictriplets(int []nums,int diff) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length;j++) {
			for(int k=j;k<nums.length;k++) {
				if(nums[k]-nums[j]==diff && nums[j]-nums[i]==diff && i!=j && k!=j) {
				count++;	
				}
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
int diff=s.nextInt();
System.out.println(arithmetictriplets(arr,diff));
	}

}
