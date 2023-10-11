package Assignment_3;
import java.util.*;
public class running_sum_of_array {
public static int [] runningsum(int []arr) {
	int []pre=new int[arr.length];
	pre[0]=arr[0];
	for(int i=1;i<arr.length;i++) {
		pre[i]= arr[i]+pre[i-1];
	}
	return pre;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int []arr=new int[n];
   for(int i=0;i<arr.length;i++) {
	   arr[i]=s.nextInt();
   }
  int []pre=runningsum(arr);
   for(int i=0;i<pre.length;i++) {
	   System.out.print(pre[i]+" ");
   }
	}

}
