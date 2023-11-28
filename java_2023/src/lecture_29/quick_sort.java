package lecture_29;

public class quick_sort {
public static int helper(int []arr,int s,int e) {
	int i=s;
	int index=s;
	int pivot=arr[e];
	while(i<=e) {
		if(pivot<=arr[i]) {
			i++;
		}else {
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			i++;
			index++;
		}
	}
	int temp=arr[index];
	arr[index]=arr[e];
	arr[e]=temp;
	return index;
}
public static void quicksort(int []arr,int s,int e) {
	if(s>=e) {
		return;
	}
	int pivotindex=helper(arr,s,e);
	quicksort(arr,s,pivotindex-1);
	quicksort(arr,pivotindex+1,e);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {13,30,6,10,7,9,20,11};
quicksort(arr,0,arr.length-1);

for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
