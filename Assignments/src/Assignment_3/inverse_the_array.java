package Assignment_3;
import java.util.*;
public class inverse_the_array {
public static void swapindex(int []arr) {
	int []swapindex=new int[arr.length];
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		index=arr[i];
		swapindex[index]=i;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(swapindex[i]+" ");
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
swapindex(arr);
	}

}
