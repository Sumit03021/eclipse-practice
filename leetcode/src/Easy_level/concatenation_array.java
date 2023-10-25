package Easy_level;
import java.util.*;
public class concatenation_array {
public static int [] concatarr(int []nums) {
	int []concatnums=new int[2*nums.length];
	for(int i=0;i<nums.length;i++) {
		concatnums[i]=nums[i];
	}
	for(int i=nums.length;i<2*nums.length;i++) {
		concatnums[i]=nums[i-nums.length];
	}
	return concatnums;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int []news=concatarr(arr);
for(int i=0;i<news.length;i++) {
	System.out.print(news[i]+" ");
}
	}

}
