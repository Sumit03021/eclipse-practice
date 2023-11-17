package maths;
import java.util.*;
public class reverse_integer {
public static int reverse(int x) {
	long sum=0;
	while(x!=0) {
		int ld=x%10;
		sum=sum*10+ld;
		x=x/10;
	}
	sum=sum/10;
	if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) {
		return 0;
	}
	if(x<0) {
		return (int)(sum)*(-1);
	}else {
		return (int)(sum);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
System.out.println(reverse(x));
	}

}
