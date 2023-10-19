package Easy_level;
import java.util.*;
public class alternating_digit_sum {
public static int alternatingsum(int n) {
	int sum=0;
	while(n>0) {
		int ld=n%10;
		sum=sum*10+ld;
		n=n/10;
	}
	int altsum=0;
	int count=0;
	while(sum>0) {
		int ld1=sum%10;
		count++;
		if(count%2!=0) {
			altsum=altsum+ld1;
		}else {
			altsum=altsum-ld1;
		}
		sum=sum/10;
	}
	return altsum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(alternatingsum(n));
	}

}
