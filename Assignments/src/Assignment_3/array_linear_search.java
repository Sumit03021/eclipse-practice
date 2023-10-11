package Assignment_3;
import java.util.*;
public class array_linear_search {
public static int linearsearch(int []arr,int m) {
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==m) {
         	int ans=i;
         	return ans;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
 for(int i=0;i<arr.length;i++) {
	 arr[i]=s.nextInt();
 }
 int m=s.nextInt();
 System.out.println(linearsearch(arr,m));
 
	}

}
