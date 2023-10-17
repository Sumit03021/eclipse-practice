package Easy_level;
import java.util.*;
public class double_reverse {
public static boolean doublereverse(int num) {
	int ans=num;
	int sum=0;
	while(num>0) {
		int ld=num%10;
		sum=sum*10 +ld;
		num=num/10;
	}
	int sum1=0;
	while(sum>0) {
		int ld1=sum%10;
		sum1=sum1*10 +ld1;
		sum=sum/10;
	}
    if(ans==sum1) {
    	return true;
    }else {
	return false;
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(doublereverse(n));
	}

}
