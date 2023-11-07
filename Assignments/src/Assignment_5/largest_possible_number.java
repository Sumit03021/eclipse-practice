package Assignment_5;
import java.util.*;
public class largest_possible_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
String s1="";
for(int i=0;i<t;i++) {
int n=s.nextInt();
String []arr=new String[n];
for(int j=0;j<n;j++) {
	arr[j]=s.next();
}
Arrays.sort(arr);

for(int j=arr.length-1;j>=0;j--) {
	s1=s1+arr[j];
}
	}
char[]arr1=s1.toCharArray();
for(int i=0;i<arr1.length;i++) {
	System.out.print(arr1[i]);
}

	}
}
