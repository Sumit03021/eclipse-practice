package arrays;
import java.util.*;
public class create_targeted_array {
public static int [] targetarray(int []nums,int []index) {
	int []target=new int[nums.length];
	ArrayList<Integer>arr =new ArrayList<Integer>();
	for(int i=0;i<nums.length;i++) {
		arr.add(index[i],nums[i]);
	}
	for(int i=0;i<nums.length;i++) {
		target[i]=arr.get(i);
	}
	return target;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []nums=new int[n];
for(int i=0;i<n;i++) {
	nums[i]=s.nextInt();
}
int []index=new int[n];
for(int i=0;i<n;i++) {
	index[i]=s.nextInt();
}
int []target=targetarray(nums,index);
for(int i=0;i<n;i++) {
	System.out.print(target[i]+" ");
}
	}

}
