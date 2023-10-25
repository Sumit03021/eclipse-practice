package Lecture_26;
import java.util.*;
public class sum_recurrsive {
	public static int sum(int n) {
	if(n==1) {
		return 1;
	}
	int chhota_ans=sum(n-1);
	int bada_ans=n+chhota_ans;
	return bada_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sum(n));
	}

}
