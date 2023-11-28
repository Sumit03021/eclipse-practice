package binary_search;
import java.util.*;
public class kth_missing_number {
public static int kthmissing(int []arr,int k) {
	ArrayList<Integer>num=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length+k;j++) {
		if(arr[i]!=j) {
			num.add(i);
		}
	}
	}
	return num.get(k);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int k=s.nextInt();
System.out.println(kthmissing(arr,k));
	}

}
