package binary_search;
import java.util.*;
public class arranging_coin {
public static int rows(int n) {
	long low=1;
	long high=Integer.MAX_VALUE;
	long ans=1;
	while(low<=high) {
		long mid=low+(high-low)/2;
		long rows=(mid)*(mid+1)/2;
		if(rows==n) {
			ans=mid;
            break;
		}else if(rows>n) {
			high=mid-1;
			ans=high;
		}
		else {
			low=mid+1;
		}
	}
	return (int)ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(rows(n));
	}

}
