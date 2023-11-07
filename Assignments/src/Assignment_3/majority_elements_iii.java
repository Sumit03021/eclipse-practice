package Assignment_3;

import java.util.*;

public class majority_elements_iii {
public static int [] majority(int []arr) {
	int n=arr.length;
	int []majority=new int[n];
	for(int i=0;i<n;i++) {
		majority[i]=1;
	}
	for(int i=1;i<n;i++) {
		if(arr[i]==arr[i-1])
	}
	return majority;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}

		int []majority=majority(arr);
		if(majority.length==0) {
			System.out.println("No Majority Elements");
		}else {
		for(int i=0;i<majority.length;i++) {
			System.out.print(majority[i]+" ");
		}
			}
			}
		

}
