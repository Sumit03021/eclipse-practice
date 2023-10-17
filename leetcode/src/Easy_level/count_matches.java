package Easy_level;
import java.util.*;
public class count_matches {
public static int countmatches(int n) {
	int matches=0;
	while(n>1) {
		if(n%2==0) {
			matches=matches+n/2;
			n=n/2;
		}else {
			matches=matches+(n+1)/2;
			n=(n-1)/2;
		}
	}
	return matches;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(countmatches(n));
	}

}
