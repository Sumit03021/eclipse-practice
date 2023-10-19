package Easy_level;
import java.util.*;
public class n_unique_integer_sum_zero {
public static int [] sumzero(int n) {
	int []arr=new int[n];
	int []sum=new int[arr.length];
	sum[0]=arr[0];
	for(int i=1;i<n;i++) {
		sum[i]=sum[i-1]+arr[i];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sumzero(n));
	}

}
