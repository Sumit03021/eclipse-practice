package hackathon_1;
import java.util.*;
public class max_height_to_cut_off_atleast_wood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
int wood=s.nextInt();
Arrays.sort(arr);
int left=0;
int right=arr[n-1];
int result=0;
while(left<=right) {
	int mid=(left+right)/2;
	long total=0;
	for(int i=0;i<n;i++) {
		total+=Math.max(0,arr[i]-mid);
	}
	if(total>=wood) {
		result=mid;
		left=mid+1;
	}else {
		right=mid-1;
	}
}
System.out.println(result);
	}

}
