package Assignment_4;
import java.util.*;
public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
long t=s.nextLong();

for(long i=0;i<t;i++) {
	long n=s.nextLong();
	long k=s.nextLong();
	long x1=1;
	long ans=-1;
	long x2=Long.MAX_VALUE;
	while(x1<=x2) {
		long x=(x2-x1)/2+x1;
		if((long)Math.pow(x,k)==n) {
			 ans=x;
			break;
		}else if((long)Math.pow(x, k)<n) {
			x1=x+1;
		}else {
			x2=x-1;
		}
		ans=x;
	}
	System.out.println(ans);
}
	}

}
