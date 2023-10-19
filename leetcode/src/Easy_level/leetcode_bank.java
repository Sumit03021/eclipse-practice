package Easy_level;
import java.util.*;
public class leetcode_bank {
public static int moneyinbank(int n) {
	int sum=0;
	int ans=n;
	int count=ans/7;
	sum=sum + count*(n%7);
	for(int i=1;i<=n;i++) {
		if(i%7!=0 && i>7) {
			sum=sum+(i%7);
		}else {
			sum=sum+i;
		}
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(moneyinbank(n));
	}

}
