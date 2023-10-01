package Lecture_21;
import java.util.Arrays;
import java.util.Scanner;

public class smallest_max_time {
	public static boolean Max_time(int []arr,int k,int n,int t) {
		int how_much_painter=arr[0];
		int How_much_paint=1;
		for(int i=1;i<n;i++) {
			int cur_time=How_much_paint + arr[i];
			if(cur_time <=t) {
				how_much_paint++;
				how_much_paint=;
			}
		}
		if(how_much_paint >=n) {
			return true;
		}else {
			return false;
		}
	}
public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
int []arr= new int[n];
for(int i=0;i<k;i++) {
	arr[i]=s.nextInt();
}
 Arrays.sort(arr);
int low=1;
int high=arr[k-1]-arr[0];
int ans=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(Max_time(arr,k,n,mid)== true) {
			ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	System.out.println(ans);
	}
}
