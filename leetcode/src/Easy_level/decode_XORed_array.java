package Easy_level;
import java.util.*;
public class decode_XORed_array {
public static int [] decodeXOR(int []encoded,int first) {
 int []arr=new int[encoded.length+1];
   arr[0]=first;
   arr[1]=encoded[0]-first;
 for(int i=2;i<arr.length;i++) {
	 arr[i]=Math.abs(encoded[i-1]-arr[i-1]);
 }
 return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int first=s.nextInt();
		int []nums=decodeXOR(arr,first);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
