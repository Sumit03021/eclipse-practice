package Assignment_3;
import java.util.*;
public class sum_pairs {
public static void sumpair(int []arr,int target) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println(arr[i]+" "+"and"+" "+arr[j]);
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for( int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
Arrays.sort(arr);
int m=s.nextInt();
sumpair(arr,m);

	}

}
