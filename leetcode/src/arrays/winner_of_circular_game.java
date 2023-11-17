package arrays;
import java.util.*;
public class winner_of_circular_game {
public static int winner(int n,int k) {
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=i+1;
	}
	int count=n;
	while(count>=1) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j+=k) {
			arr[j]=0;
			count--;
			if(arr[j]==0) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	int ans=0;
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
System.out.println(winner(n,k));
	}

}
