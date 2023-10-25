package Easy_level;
import java.util.*;
public class power_of_three {
public static boolean powerthree(int n) {
	int []arr=new int[20];
	for(int i=0;i<20;i++) {
		arr[i]=(int)Math.pow(3, i);
	}
	int match=n;
	int low=0;
	int high=19;
	
	while(low<=high) {
		int mid=(low+high)/2;
		if(match==arr[mid]) {
	        
	        return true;
		}else if(match>arr[mid]) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(powerthree(n));
	}

}
