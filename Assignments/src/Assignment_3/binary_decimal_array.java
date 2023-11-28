package Assignment_3;
import java.util.*;
public class binary_decimal_array {
public static void binarydecimal(int []arr) {
	int []dec=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int mul=1;
		while(arr[i]>0) {
			int ld=arr[i]%10;
			dec[i]+=ld*mul;
			mul*=2;
			arr[i]/=10;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(dec[i]);
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
binarydecimal(arr);
	}

}
