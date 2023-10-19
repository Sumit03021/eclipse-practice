package Easy_level;
import java.util.*;
public class max_number_balls_in_box {
public static int countballs(int lowLimit,int highLimit) {
	int []count=new int[highLimit+1];
	for(int i=lowLimit;i<=highLimit;i++) {
		int sum=0;
		int ball=i;
		while(ball>0) {
			int ld=ball%10;
			sum=sum+ld;
			ball=ball/10;
		}
		count[sum]++;
	
	}
	int max=Integer.MIN_VALUE;
	for(int i=0;i<highLimit+1;i++) {
		if(max<count[i]) {
			max=count[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(countballs(n,m));

	}
}
