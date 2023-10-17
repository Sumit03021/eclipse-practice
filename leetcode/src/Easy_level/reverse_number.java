package Easy_level;
import java.util.*;
public class reverse_number {
public static int reversenumber(int x) {
	int sum=0;
    int ans=x;
    if(x<0) {
    	x=x*(-1);
    }
    int ans1=Integer.MAX_VALUE;
    System.out.println(ans1);
    while(x>0) {
    	int ld=x%10;
        sum=sum*10+ld;
    	x=x/10;
    }
    int answer=sum;
    int answer1=sum;
    int val=0;
    int plaval=1;
    while(sum>0) {
    	int rem=sum%2;
    	val=val+rem*plaval;
    	sum=sum/2;
    	plaval=plaval*10;
    }
    if(ans<0) {
    	answer1=answer1*(-1);
    }
    int val1=0;
    int plaval1=1;
    while(answer1<0) {
    	int rem=answer1%2;
    	val1=val1 + rem*plaval1;
    	answer1=answer1/2;
    	plaval1=plaval1*10;
    }
    if(ans<0) {
    	answer=answer*(-1);
    }
    if(val>Math.pow(2,31)-1 && val1< -Math.pow(2,31)) {
       answer=answer*0;
    }
    return answer;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(reversenumber(n));
	}

}
