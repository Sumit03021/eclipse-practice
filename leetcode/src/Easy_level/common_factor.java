package Easy_level;
import java.util.*;
public class common_factor {
public static int commonfactor(int a,int b) {
	int count=0;
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				count++;
			}
		}
	
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(commonfactor(n,m));
	}

}
