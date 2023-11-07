package Lecture_28;
import java.util.*;
public class subset {
public static void print(int []arr,int k,int sum,int i,String ans) {
if(i==arr.length) {
	if(sum<=k) {
	System.out.println(ans);
	}
	return;
}
if(sum>k) {//backtracking---remove unneccessary calls of recurrsion
	return;
}
		print(arr,k,sum+arr[i],i+1,ans+arr[i]+",");
	print(arr,k,sum+0,i+1,ans);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
print(arr,10,0,0,"");
	}

}
