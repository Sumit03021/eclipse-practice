package inclusion_exclusion;

import java.util.Scanner;

public class queries_sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consecutive sum uses method--inclusion and exclusion .
		Scanner s= new Scanner(System.in);
		int []arr = {1,2,3,4,5,6,7};
		int []pre =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				pre[i]=arr[i];
			}else {
			pre[i]=pre[i-1]+arr[i];
			}
		}
		
		int q=s.nextInt();
		for(int i=1;i<=q;i++) {
			int l=s.nextInt();
			int r=s.nextInt();
			int sum=0;
			for(int j=l;j<=r;j++) {
				if(l!=0) {
					sum= pre[r]-pre[l-1];
				}else {
					sum = pre[r];
				}
			}
			System.out.println(sum);
		}
	}

}
