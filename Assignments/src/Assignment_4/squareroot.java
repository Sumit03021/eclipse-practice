package Assignment_4;
import java.util.*;
public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
double x1=0;
double ans=-1;
double x2=Integer.MAX_VALUE;
while(x1<=x2) {
	double x=(double)x1+((double)x2-(double)x1)/2;
	if((double)Math.pow(x,2)==n) {
		ans=x;
		break;
	}else if((double)Math.pow(x, 2)<n) {
		x1=(double)x+1;
	}else {
		x2=(double)x-1;
	}
	ans=(double)x;
}
System.out.println(ans);
	}
}

