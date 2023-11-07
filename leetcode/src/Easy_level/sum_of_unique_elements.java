package Easy_level;
import java.util.*;
public class sum_of_unique_elements {
public static int sum(int []nums) {
	Arrays.sort(nums);
	int []count=new int[nums[nums.length-1]+1];
	for( int i=0;i<nums.length;i++) {
				int index=nums[i];
				count[index]++;
			}
	int sum=0;
	int []newarr=new int[count.length];
	for( int i=0;i<count.length;i++) {
		if(count[i]==1) {
			newarr[i]=i;
		}else {
			newarr[i]=0;
		}
		sum=sum+newarr[i];
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(sum(arr));
	}

}
