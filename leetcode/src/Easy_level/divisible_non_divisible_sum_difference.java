package Easy_level;
import java.util.*;
public class divisible_non_divisible_sum_difference {
public static int sumdifference(int n,int m) {
	int sum1=0;
	int sum2=0;
	for(int i=1;i<=n;i++) {
		if(i%m!=0) {
			sum1=sum1+i;
		}else if(i%m==0) {
			sum2=sum2+i;
		}
	}
	int sum=sum1-sum2;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(sumdifference(n,m));
}
	}


