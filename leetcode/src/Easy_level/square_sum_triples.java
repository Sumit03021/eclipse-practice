package Easy_level;
import java.util.*;
public class square_sum_triples {
public static int sqsumtriples(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			for(int k=1;k<=n;k++) {
				int ans=(int)Math.pow(i,2)+ (int)Math.pow(j, 2);
				if(ans==Math.pow(k,2)) {
					count++;
					System.out.println(ans);
				}
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sqsumtriples(n));
	}

}
