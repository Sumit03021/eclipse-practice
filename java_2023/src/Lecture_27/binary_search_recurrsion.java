package Lecture_27;

public class binary_search_recurrsion {
public static int binary_search(int []arr,int target,int low,int high) {
	
	 if(low>high) {
		 return -1;
	 }
	int mid=(low+high)/2;
	
	if(arr[mid]==target) {
		
		return mid;
	}else if(arr[mid]>target) {
		return binary_search(arr, target, low, mid-1);
	}
	else {
		
		return binary_search(arr, target, mid+1, high);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4,5,6,7,8,9,10};
System.out.println(binary_search(arr,5,0,arr.length-1));
	}

}
