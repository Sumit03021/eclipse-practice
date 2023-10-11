package Assignment_3;

import java.util.Scanner;

public class reverse_array {
public static void reverse(int []arr) {
	int i=0;
	int j=arr.length-1;
	while(i<=j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
reverse(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
