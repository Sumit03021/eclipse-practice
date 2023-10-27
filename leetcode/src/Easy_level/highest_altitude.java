package Easy_level;
import java.util.*;
public class highest_altitude {
public static int highestaltitude(int []gain) {
	int []arr=new int[gain.length+1];
	arr[0]=0;
	int max=Integer.MIN_VALUE;
	for(int i=1;i<arr.length;i++) {
		arr[i]=arr[i-1]+gain[i-1];
	}
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for( int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}

System.out.println(highestaltitude(arr));
	}

}
