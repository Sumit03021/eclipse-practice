package Easy_level;
import java.util.*;
public class employees_met_target {
public static int target(int []hours,int target) {
	int count=0;
	for( int i=0;i<hours.length;i++) {
		if(hours[i]>=target) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int target=s.nextInt();
System.out.println(target(arr,target));
	}

}
