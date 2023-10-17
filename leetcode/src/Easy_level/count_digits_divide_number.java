package Easy_level;
import java.util.*;
public class count_digits_divide_number {
public static int countdigitdivide(int num) {
	int ans=num;
	int count=0;
	while(num>0) {
		int ld=num%10;
		if(ans%ld==0) {
			count++;
		}
		num=num/10;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(countdigitdivide(n));
	}

}
