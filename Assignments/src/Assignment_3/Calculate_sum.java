package Assignment_3;
import java.util.*;
public class Calculate_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
  int m=s.nextInt();
  for(int i=0;i<m;i++) {
	 int q=s.nextInt();
	 int []newarr=new int[n];
	for(int j=0;j<n;j++) {
		for(int k=q;k>=0;k--) {
		 newarr[j]+=arr[(n+j-k+1)%n];
		 System.out.print(newarr[j]+" ");
	}
		System.out.println();
	}
}
	}
}
