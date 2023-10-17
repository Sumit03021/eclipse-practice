package Easy_level;
import java.util.*;
public class good_pair {
public static int goodpair(int []nums) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length-1;j++) {
			if(nums[i]==nums[j+1]) {
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
System.out.println(goodpair(arr));
	}

}
