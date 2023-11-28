package greedy;
import java.util.*;
public class minimum_sum_after_spliting_digit {
public static int minsum(int num) {
	int []arr=new int[4];
	int i=0;
	while(num>0) {
		int ld=num%10;
		arr[i]=ld;
		num=num/10;
		i++;
	}
	Arrays.sort(arr);
	
	int new1=arr[0]*10+arr[3];
	int new2=arr[1]*10+arr[2];
	int sum=new1+new2;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(minsum(n));
	}

}
