package Easy_level;
import java.util.*;
public class plus_one {
public static int [] plusone(int []digits) {
	int sum=0;
	for(int i=0;i<digits.length;i++) {
		sum=sum*10 +digits[i];
		
	}
	System.out.println(sum);
	sum=sum+1;
	int count=0;
	int ans=sum;
	System.out.println(ans);
	while(sum>0) {
		int ld=sum%10;
		sum=sum/10;
		count++;
	}
	int []arr=new int[count];
	for(int i=count-1;i>=0;i--) {
		int lastdigit =ans%10;
		arr[i]=lastdigit;
		ans=ans/10;
	}
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []array =new int[n];
for(int i=0;i<array.length;i++) {
	array[i]=s.nextInt();
}
int []arr=plusone(array);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
