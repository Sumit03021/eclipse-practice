package maths;
import java.util.*;
public class nth_tribonacci {
public static int tribonacci(int n) {
	int a=0;
	int b=1;
	int c=1;
	int i=4;
	int ans=0;
		if(n==0) {
			return 0;
		}else if(n==1 ||n==2) {
			return 1;
		}else {
			int d=a+b+c;
			ans=d;
	while(i<=n) {
		a=b;
		b=c;
		c=d;
		d=a+b+c;
		i++;
		ans=d;
	}
		}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(tribonacci(n));
	}

}
