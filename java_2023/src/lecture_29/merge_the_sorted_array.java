package lecture_29;

public class merge_the_sorted_array {
	public static int [] merge(int []arr1,int []arr2) {
		int []ans=new int[arr1.length+arr2.length];
		int index=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[index]=arr1[i];
				index++;
				i++;
			}else{
				ans[index]=arr2[j];
				index++;
				j++;
			}
	        
		}
		
		while(i<arr1.length) {
			
			ans[index]=arr1[i];
			index++;
			i++;
		}
		
		while(j<arr2.length) {
			
			ans[index]=arr2[j];
			index++;
			j++;
		}
		
		
		return ans;
	}
public static int [] merges(int []arr,int s,int e) {
	if(s==e) {
		int []ans=new int[1];
		ans[0]=arr[e];
		return ans;
	}
	int mid=s+(e-s)/2;
	int []arr1=merges(arr,s,mid);
	int []arr2=merges(arr,mid+1,e);
	int []array=merge(arr2,arr1);
	return array;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {10,2,4,3,2,7,8,9,3,6,8,0,6,8};
int []ans=merges(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++) {
	System.out.print(ans[i]+" ");
}
	}

}
