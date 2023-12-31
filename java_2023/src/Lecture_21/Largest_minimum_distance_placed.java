package Lecture_21;
import java.util.*;
public class Largest_minimum_distance_placed {

	public static boolean can_i_placed(int []arr,int n,int c,int d) {
			int how_much_placed=1;
			int last_placed_cow=arr[0];
			for(int i=1;i<n;i++) {
				int cur_dis=arr[i]-last_placed_cow;
				if(cur_dis >=d) {
					how_much_placed++;
					last_placed_cow=arr[i];
				}
			}
			if(how_much_placed >=c) {
				return true;
			}else {
				return false;
			}
		}
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
	int []arr= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	int low=1;
	int high=arr[n-1]-arr[0];
	int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(can_i_placed(arr,n,c,mid)== true) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println(ans);
	}
}
