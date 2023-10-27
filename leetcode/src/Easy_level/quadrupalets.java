package Easy_level;
import java.util.*;
public class quadrupalets {
	public static int quadrupalets(int []nums) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i;j<nums.length;j++) {
			for(int k=j;k<nums.length;k++) {
				for( int l=k;l<nums.length;l++) {
				if(nums[i]+nums[j]+nums[k]==nums[l] && i!=j && j!=k && k!=l) {
				count++;	
				}
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
System.out.println(quadrupalets(arr));
	}

}
