package Assignment_3;

import java.util.Scanner;

public class product_except_self {
public static void product(int []arr) {
	int []prefix=new int[arr.length];
	int []suffix=new int[arr.length];
	int []product= new int[arr.length];
	prefix[0]=1;
	suffix[arr.length-1]=1;
	
	for(int i=1;i<arr.length;i++) {
		prefix[i]=arr[i-1]*prefix[i-1];
	}
	for(int i=arr.length-2;i>=0;i--) {
		suffix[i]=arr[i+1]*suffix[i+1];
	}
	for(int i=0;i<arr.length;i++) {
		product[i]=prefix[i]*suffix[i];
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(product[i]+" ");
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
product(arr);
	}

}
