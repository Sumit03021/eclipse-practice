package Lecture_27;

public class reverse_array {
public static void reversearray(int []arr,int i,int j) {
	if(i>=j) {
		return ;
	}
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	reversearray(arr,i+1,j-1);
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4,5,6};
reversearray(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
