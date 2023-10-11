package Assignment_3;
import java.util.*;
public class insertion_sort {
public static void insertsort(int []arr,int i,int item) {
	while(i>=0 && arr[i]>item) {
		arr[i+1]=arr[i];
		i--;
	}
	arr[i+1]=item;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
for(int i=1;i<arr.length;i++) {
	insertsort(arr,i-1,arr[i]);
}
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
