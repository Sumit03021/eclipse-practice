package Easy_level;

import java.util.*;

public class sum_of_squares_special_elements {
public static int squarespecial(int []nums) {
	int n=nums.length;
	int sumsq=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			sumsq=sumsq+(nums[i-1]*nums[i-1]);
		}
	}
	return sumsq;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []array =new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println(squarespecial(array));
	}
	

}
