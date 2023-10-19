package Easy_level;
import java.util.*;
public class delayed_arrival_time {
public static int delayedarrivaltime(int arrivalTime, int delayedTime) {
	int sum=arrivalTime+delayedTime;
	if(sum>=24) {
		sum=sum%24;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(delayedarrivaltime(n,m));
	}

}
