package Assignment_4;
import java.util.*;
public class murthal_parantha {
public static void maxtime(int []arr,int target,int time) {
	int count=0;
	int mul=1;
	int sumtime=0;
	for(int i=0;i<arr.length;i++) {
		
		while(sumtime<=time) {
			sumtime=sumtime+arr[i];
			arr[i]=arr[i]*mul;
			mul++;
			count++;
		}
		System.out.println(sumtime);
		System.out.println(count);
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//int t=s.nextInt();
int l=s.nextInt();
int []arr=new int[l];
for(int i=0;i<l;i++) {
	arr[i]=s.nextInt();
}
int target=s.nextInt();
int time=s.nextInt();
maxtime(arr,target,time);
	}

}
