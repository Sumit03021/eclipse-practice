package Assignment_3;
import java.util.*;
public class majority_elements_ii {
public static int count(int []arr,int num) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==num) {
		count++;
	}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	if(count(arr,arr[i])>n/3) {
		System.out.print(arr[i]+" ");
}
	}
	}
}
