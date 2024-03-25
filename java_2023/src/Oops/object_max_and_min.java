package Oops;
import java.util.*;
public class object_max_and_min {
public static maxMin pair(int []arr) {
	maxMin p=new maxMin(Integer.MIN_VALUE,Integer.MAX_VALUE);
	for(int i=0;i<arr.length;i++) {
		p.max=Math.max(p.max,arr[i]);
		p.min=Math.min(p.min,arr[i]);
	}
	return p;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
maxMin p=pair(arr);
System.out.println(p.max);
System.out.println(p.min);
	}

}
