package Assignment_3;
import java.util.*;
public class majority_elements {
public static void majority(int []arr) {
	int n=arr.length;
	int k=Math.floorDiv(n, 3);
	int count=-1;
	int index=0;
	int index1=0;
	for(int i=0;i<n;i++) {
		while(index<=index1+3 && index1<=index) {
			int ans=1;
			int low =index;
			int high=n-1;
			while(low<=high) {
				int mid=(low+high)/2;
				if(arr[mid]==ans) {
					index=mid;
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
			System.out.println(index);
			while(low<=high) {
				int mid1=(low+high)/2;
				if(arr[mid1]==ans) {
					index1=mid1;
					high=mid1-1;
				}else {
					low=mid1+1;
				}
			}
			System.out.println(index1);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
Arrays.sort(arr);
majority(arr);
	}

}
