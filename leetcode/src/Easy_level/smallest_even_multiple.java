package Easy_level;
import java.util.*;
public class smallest_even_multiple {
public static int smallestmultiple(int n) {
	int ans=n;
	if(n%2!=0) {
		ans=ans*2;
	}else {
		ans=ans;
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(smallestmultiple(n));
	}
}
