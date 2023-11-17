package arrays;
import java.util.*;
public class peak_index_of_mountain_array {
public static int peakindex(int []arr) {
	int max=-1;;
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
			index=i;
		}
	}
	return index;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
		}
		System.out.println(peakindex(nums));
	}

}
