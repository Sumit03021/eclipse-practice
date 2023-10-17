package Easy_level;
import java.util.*;
public class sum_multiples {
public static int summultiple(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		if(i%3==0 ||i%5==0 ||i%7==0) {
			sum=sum+i;
		}
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(summultiple(n));
	}

}
