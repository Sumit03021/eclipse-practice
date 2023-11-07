package Assignment_4;
import java.util.*;
public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
long x1=0;
long ans=-1;
long x2=Long.MAX_VALUE;
while(x1<=x2) {
	long x=x1+(x2-x1)/2;
	if((int)Math.pow(x,2)==n) {
		ans=x;
		break;
	}else if((int)Math.pow(x, 2)<n) {
		x1=x+1;
	}else {
		x2=x-1;
	}
	ans=x;
}
System.out.println(ans);
	}
}

