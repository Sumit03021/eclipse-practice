package Easy_level;
import java.util.*;
public class special_discount {
public static int [] special(int []prices) {
	int []discount=new int[prices.length];
	for(int i=0;i<prices.length;i++) {
		for(int j=i+1;j<prices.length;j++) {
			for(int k=j+1;k<prices.length;k++) {
			if(prices[j]<=prices[i] && prices[k]<=prices[i]) {
				discount[i]=prices[j];
			}
		}
	}
	}
		for( int i=0;i<prices.length;i++) {
			System.out.print(discount[i]+" ");
		}
	return discount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int []discount=special(arr);
for(int i=0;i<n;i++) {
 System.out.print(discount[i]+" ");
}
	}

}
