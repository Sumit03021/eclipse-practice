package Assignment_4;
import java.util.*;
public class columns_max_sum {
public static void columnmaxsum(int [][]arr) {
	int []columnsum=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			columnsum[j]=columnsum[j]+arr[i][j];
		}
	}
	int max=Integer.MIN_VALUE;
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		if(max<columnsum[i]) {
			ans=i+1;
			max=columnsum[i];
		}
	}
System.out.print(ans+" "+max);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]arr= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		columnmaxsum(arr);
	}
    
}
