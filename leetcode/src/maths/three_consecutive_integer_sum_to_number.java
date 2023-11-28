package maths;
import java.util.*;
public class three_consecutive_integer_sum_to_number {
public static long [] threecons(long num) {
	if(num%3==0) {
		long []arr=new long[3];
		long ans=num/3;
		arr[0]=ans-1;
		arr[1]=ans;
		arr[2]=ans+1;
		return arr;
	}else {
		long []arr=new long[0];
		return arr;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long n=s.nextLong();
long []arr=threecons(n);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
