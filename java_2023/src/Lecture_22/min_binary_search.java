package Lecture_22;

public class min_binary_search {
public static boolean minbinary(int []arr,int min) {
	for(int i=0;i<arr.length;i++) {
		if(min >arr[i]) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {14,10,6,20,12,3,3,-2,-34,-44};
 int low=Integer.MIN_VALUE;
 int high=Integer.MAX_VALUE;
 int ans=-1;
 while(low<=high) {
	 int mid=(high+low)/2;
	 if(minbinary(arr,mid)==false) {
		 high=mid-1;
	 }else {
		 ans=mid;
		 low=mid+1;
	 } 
 }
 System.out.println(ans);
	}
}
