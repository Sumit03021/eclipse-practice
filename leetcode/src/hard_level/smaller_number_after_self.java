package hard_level;
import java.util.*;
public class smaller_number_after_self {
	public static List<Integer> numbersmallerself(int []nums) {
	ArrayList<Integer>current=new ArrayList<Integer>();
	int current1=0;
	for(int i=0;i<nums.length;i++) {
		current.add(0);
		for(int j=i;j<nums.length-1;j++) {
			if(nums[i]>nums[j+1]) {
				current.set(i,current1++);
			}
		}
	}
	return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
	List<Integer>nums=numbersmallerself(arr);
		
			System.out.print(nums);
	
	}
}
