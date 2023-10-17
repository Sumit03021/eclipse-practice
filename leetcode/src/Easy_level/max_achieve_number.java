package Easy_level;
import java.util.*;
public class max_achieve_number {
	// for (1<=n<=50);
public static int maxAchieveNumber(int num,int t) {
	int news=num+t;
	int x=news+t;
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int t=s.nextInt();
System.out.println(maxAchieveNumber(n,t));
	}
}
