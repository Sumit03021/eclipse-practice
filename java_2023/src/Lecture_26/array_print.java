package Lecture_26;

public class array_print {
public static void arrayprint(int []arr,int i) {
	if(i==0) {
		System.out.println(arr[0]);
		return;
	}
	System.out.print(arr[i]+" ");
	arrayprint(arr,--i);
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {3,5,1,2,3,6,7};
arrayprint(arr,arr.length-1);
	}

}
