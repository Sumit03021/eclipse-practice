package Easy_level;
import java.util.*;
public class palidromic_number {
public static boolean ispalidromic(int n) {
	int sum=0;
	int ans=n;
	while(n>0) {
		int ld=n%10;
		sum=sum*10 + ld;
		n=n/10;
	}
	System.out.println(sum);
	if(sum==ans) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(ispalidromic(n));
	}

}
