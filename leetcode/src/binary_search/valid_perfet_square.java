package binary_search;
import java.util.*;
public class valid_perfet_square {
public static boolean perfectsq(int num) {
	long low=0;
	long high=Integer.MAX_VALUE;
	while(low<=high) {
		long mid=low+(high-low)/2;
		if(mid*mid==num) {
			return true;
		}else if(mid*mid>num) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int num=s.nextInt();
System.out.println(perfectsq(num));
	}

}
