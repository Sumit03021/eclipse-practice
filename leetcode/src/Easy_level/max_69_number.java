package Easy_level;
import java.util.*;
public class max_69_number {
public static int [] maxnumber(int num) {
	int ans=num;
	int ans1=num;
	int ans2=num;
	int ans3=num;
	int count=0;
	while(num>0) {
		count++;
		num=num/10;
	}
	
	while(ans>0) {
     int ld=ans%10;	
     ans=ans/10;
     if(ld==6) {
    	 ans1=ans1 +3*
     }
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=s.nextInt();
int []arr=maxnumber(n);
for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]+" ");
	}
	}
}
