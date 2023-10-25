package Lecture_27;

public class find_target {
public static int findtarget(int []arr,int i,int target) {
	if(i==arr.length) {
		return -1;
	}
	if(arr[i]==target) {
		return i;
	}
	return findtarget(arr,i+1,target);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4,5,6,7,8,9,10};
System.out.println(findtarget(arr,0,5));
	}

}
