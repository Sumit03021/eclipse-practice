package Easy_level;
import java.util.*;
public class rank_transform_array {
public static int [] ranking(int []arr) {
	int []rank=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		rank[i]=1;
		for( int j=0;j<arr.length;j++) {
			if(arr[i]>arr[j] && j!=i) {
				rank[i]++;
		}	
		}
	}
	return rank;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int []rank=ranking(arr);
for(int i=0;i<n;i++) {
	System.out.print(rank[i]+" ");
}
	}

}
