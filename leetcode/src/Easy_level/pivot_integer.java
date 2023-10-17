package Easy_level;
import java.util.*;
public class pivot_integer {
public static int pivotinteger(int n) {
	int leftsum=(n+2)*(n+1)/2;
	int rightsum=0;
	int ans=-1;
	for(int i=n;i>=1;i--) {
		if(leftsum!=rightsum &&leftsum>rightsum) {
		leftsum=leftsum-i-1;
		rightsum=rightsum+i;
		ans=i;
		}else if(leftsum<rightsum && leftsum!=rightsum) {
			ans=-1;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(pivotinteger(n));
	}

}
