package DP;
import java.util.*;
public class staircase {
	static int count=0;
public static int staircase(int n,int []arr) {
	if(n==0) {
		return 1;
	}
	if(n<0) {
		return 0;
	}
	count++;
	System.out.println("N is "+n+", Count is "+count);
	if(arr[n]!=0) {
		return arr[n];
	}
	int val1=staircase(n-1,arr);
	int val2=staircase(n-2,arr);
	if(arr[n]==0) {
		arr[n]=val1+val2;
	}
	return arr[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int []arr =new int[n+1];
System.out.println(staircase(n,arr));
	}

}
