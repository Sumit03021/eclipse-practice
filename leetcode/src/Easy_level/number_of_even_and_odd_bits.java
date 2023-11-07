package Easy_level;
import java.util.*;
public class number_of_even_and_odd_bits {
public static int [] evenandoddbits(int n) {
	int sum=0;
	int plaval=1;
	while(n>0) {
		int ld=n%2;
		sum=sum+ld*plaval;
		plaval=plaval*10;
		n=n/2;		
	}
	int evencount=0;
	int oddcount=0;
	int count=0;

	while(sum>0) {
		int ld1=sum%10;
		count++;
		if((count-1)%2==0 && ld1==1) {
			evencount++;
		}else if(count%2==0 && ld1==1){
			oddcount++;
		}
		sum=sum/10;
	}
	int []arr=new int[2];
	arr[0]=evencount;
	arr[1]=oddcount;
return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=evenandoddbits(n);
System.out.println(arr[0]);
System.out.println(arr[1]);
	}

}
