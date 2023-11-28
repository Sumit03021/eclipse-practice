package greedy;
import java.util.*;
public class maximum_69_number {
public static int maxnumber(int num) {
	int []arr=new int[4];
	int i=0;
	while(num>0) {
		int ld=num%10;
		arr[i]=ld;
		num=num/10;
		i++;
	}
	if(arr[3]==6) {
		arr[3]=9;
	}else if(arr[2]==6 && arr[3]!=6) {
		arr[2]=9;
	}else if(arr[1]==6 && arr[2]!=6 && arr[3]!=6) {
		arr[1]=9;
	}else if(arr[0]==6 &&arr[1]!=6 && arr[2]!=6 && arr[3]!=6) {
		arr[0]=9;
	}
	int sum=0;
	for(int j=3;j>=0;j--) {
		sum=sum*10+arr[j];
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(maxnumber(n));
	}

}
