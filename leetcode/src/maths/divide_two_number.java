package maths;
import java.util.*;
public class divide_two_number {
public static int divide(int dividend,int divisor) {
	long count=0;
	if(divisor>0) {
		if(dividend>0) {
		while(dividend>=divisor) {
			dividend=dividend-divisor;
			count++;
		}
		if(count>Integer.MAX_VALUE) {
				count=Integer.MAX_VALUE;
		}
		}else {
			long divident=(-1)*(long)dividend;
			while(divident>=divisor) {
				divident=divident-divisor;
				count++;
			}
			count=(-1)*count;
			if(count<Integer.MIN_VALUE) {
				count=Integer.MIN_VALUE;
			}
		}
	}else{
		if(dividend>0) {
			long divisors=(-1)*(long)divisor;
			long divident=dividend;
			while(divident>=divisors) {
				divident=divident-divisors;
				count++;
			}
			count=(-1)*count;
			if(count<Integer.MIN_VALUE) {
					count=Integer.MIN_VALUE;
			}
			}else {
				while(dividend<=divisor) {
					dividend=dividend-divisor;
					count++;
				}
				if(count>Integer.MAX_VALUE) {
					count=Integer.MAX_VALUE;
				}
			}
	}
	return (int)count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int dividend=s.nextInt();
int divisor=s.nextInt();
System.out.println(divide(dividend,divisor));
	}

}
