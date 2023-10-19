package Easy_level;
import java.util.*;
public class sum_digits_k_base {
public static int sumofdigitbase(int n,int k) {
	int sum=0;
	int mul=1;
	while(n>0) {
		int ld=n%k;
		sum=sum +ld*mul;
		mul=mul*10;
		n=n/k;
	}
	int digitsum=0;
	while(sum>0) {
		int ld1=sum%10;
		digitsum=digitsum+ld1;
		sum=sum/10;
	}
	return digitsum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
System.out.println(sumofdigitbase(n,k));
	}

}
