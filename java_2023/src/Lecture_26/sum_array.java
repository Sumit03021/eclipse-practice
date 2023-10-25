package Lecture_26;

public class sum_array {
public static int sumofarray(int []arr,int i) {
	if(i==-1) {
		return 0;
	}
	int chhota_sum=sumofarray(arr,i-1);
	int bada_sum=chhota_sum+arr[i];
	return bada_sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {3,2,5,1,2,6,7};
System.out.println(sumofarray(arr,arr.length-1));
	}

}
