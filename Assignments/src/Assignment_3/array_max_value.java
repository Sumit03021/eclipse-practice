package Assignment_3;
import java.util.*;
public class array_max_value {
public static int maxvalue(int []arr) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int [n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
System.out.println(maxvalue(arr));

	}

}
