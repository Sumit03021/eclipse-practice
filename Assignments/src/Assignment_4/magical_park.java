package Assignment_4;
import java.util.*;
public class magical_park {
public static void magicalpark(String [][]arr,int k,int e) {
	int ans=0;
	int l=arr[0].length-1;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			while(i<arr.length) {
				int sum=0;
				if(j!=l) {
				if(arr[i][j]==".") {
					sum=sum+3;
					System.out.println(e);
				}else if(arr[i][j]=="*") {
					sum=sum-4;
					System.out.println(e);
				}else if(arr[i][j]=="#") {
					i=i+1;
					j=0;
				}
				}else {
					if(arr[i][j]==".") {
						sum=sum+2;
					}else if(arr[i][j]=="*") {
						sum=sum-5;
					}else if(arr[i][j]=="#") {
						i=i+1;
						j=0;
					}
				}
				i++;
				j++;
				ans=e-sum;
			}	
		}
	}
	
	if(ans>=k) {
		System.out.println("Yes");
		System.out.println(ans);
	}else {
		System.out.println("No");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		String [][]arr= new String[n][m];
		int k=s.nextInt();
		int e=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.next();
			}
		}
		magicalpark(arr,k,e);
	}

}
