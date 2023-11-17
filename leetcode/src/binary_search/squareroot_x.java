package binary_search;
import java.util.*;
public class squareroot_x {
public static int sqrt(int x) {
	long low=0;
	long high=Integer.MAX_VALUE;
	long ans=-1;
	while(low<=high) {
		long mid=low+(high-low)/2;
		if(mid*mid==x) {
			ans=mid;
			return (int)mid;
		}else if(mid*mid>x) {
			high=mid-1;
			ans=high;
		}else {
			low=mid+1;
		}
	}
	return (int)ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
System.out.println(sqrt(x));
	}

}
