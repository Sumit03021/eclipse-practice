package binary_search;
import java.util.*;
public class first_bad_version {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int low =1;
int high=n;
int ans=-1;
while(low<=high) {
	int mid=low+(high-low)/2;
	if(isBadVersion(mid)==true) {
		ans=mid;
		high=mid-1;
	}else {
		low=mid+1;
	}
}
return ans;

	}

}
