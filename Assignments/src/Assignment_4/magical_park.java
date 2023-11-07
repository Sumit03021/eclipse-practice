package Assignment_4;
import java.util.*;
public class magical_park {
public static void magicalpark(String [][]arr,int k,int e) {
	int ans=e;
	int l=arr[0].length-1;
		int i=0;
			while(i<arr.length && ans>=k) {
				for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j].equals(".") && j!=l && ans>=k) {
					ans=ans-3;
				}else if(arr[i][j].equals("*") && j!=l && ans>=k) {
					ans=ans+4;
				}
				else if(arr[i][j].equals(".") && ans>=k) {
						ans=ans-2;
					}else if(arr[i][j].equals("*") && ans>=k) {
					ans=ans+5;
					}else if(arr[i][j].equals("#") && ans>=k) {
						break;
					}
			}	
				i++;
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
