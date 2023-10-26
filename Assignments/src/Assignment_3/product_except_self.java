package Assignment_3;

import java.util.Scanner;

public class product_except_self {
public static void product(long []arr) {
	long []prefix=new long[arr.length];
	long []suffix=new long[arr.length];
	long []product= new long[arr.length];
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
long []arr=new long[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextLong();
}
product(arr);
	}

}
