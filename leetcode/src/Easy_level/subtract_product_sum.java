package Easy_level;
import java.util.*;
public class subtract_product_sum {
public static int subtract(int n) {
	int sum=0;
	int product=1;
	int ans=n;
	while(n>0) {
		int ld=n%10;
		product=product*ld;
		n=n/10;
	}
	while(ans>0) {
		int ld1=ans%10;
		sum=sum+ld1;
		ans=ans/10;
	}
	int answer=product-sum;
	return answer;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(subtract(n));
	}

}
