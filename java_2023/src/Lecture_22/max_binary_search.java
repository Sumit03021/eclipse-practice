package Lecture_22;

public class max_binary_search {
public static boolean maxbinary(int []arr,int max) {
for(int i=0;i<arr.length;i++) {
				if(max < arr[i]) {
					return false;
				}
			}
			return true;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		int []arr= {14,10,6,20,100,1233,-34,-90,-564};
		 int low=Integer.MIN_VALUE;
		 int high=Integer.MAX_VALUE;
		 int ans=-1;
		 while(low<=high) {
			 int mid=(high+low)/2;
			 if(maxbinary(arr,mid)==false) {
				 low=mid+1;
			 }else {
				 ans=mid;
				 high=mid-1;
			 } 
		 }
		 System.out.println(ans);
	}

}
