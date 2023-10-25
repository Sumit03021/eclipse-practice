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
int []newarr=new int[n];
for(int i=0;i<n;i++) {
	newarr[i]=arr[i];
}
int circularsum=0;
  int m=s.nextInt();
  for(int i=0;i<m;i++) {
	 int q=s.nextInt(); 
	 if(q>=1) {
	for(int j=0;j<n;j++) {
		 newarr[j]=newarr[j]+arr[(n+j-q)%n];
	}
	 }else {
		 for(int j=0;j<n;j++) {
			 newarr[j]=2*newarr[j];
		 }
	 }
	}
  for(int i=0;i<n;i++) {
	  circularsum=circularsum+newarr[i];
  }
  int sum=circularsum%((int)Math.pow(10,9)+7);
  System.out.println(sum);
	}
}

