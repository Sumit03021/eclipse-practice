package Lecture_21;
import java.util.*;
public class first_bad_version {
public static void isbadversion(int []version) {
	Scanner s = new Scanner(System.in);
	int m = s.nextInt();
	for(int i=0;i<version.length;i++) {
		if(i<m) {
			version[i]=0;
		}else {
			version[i]=1;
		}
	} 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
				int n=sc.nextInt();
				int low=0;
				 int high=n;
				 int ans=-1;
				 int []arr=new int[n];
	 isbadversion(arr); 
 while(low<=high) {
	 int mid=(low+high)/2; // mid =low +(high-low)/2
	 if(arr[mid]==1) {
		 ans=mid;
		 high=mid-1;
	 }else {
		 low=mid+1;
	 }
 }	
 System.out.println(ans);
	}
}
