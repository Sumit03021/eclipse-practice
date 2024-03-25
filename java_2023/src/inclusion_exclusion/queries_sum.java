package inclusion_exclusion;
import java.util.*;
public class queries_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int []arr = {1,2,3,4,5,6,7};
int q=s.nextInt();
for(int i=1;i<=q;i++) {
	int l=s.nextInt();
	int r=s.nextInt();
	int sum=0;
	for(int j=l;j<=r;j++) {
		sum=sum+arr[j];
	}
	System.out.println(sum);
}
	}

}
