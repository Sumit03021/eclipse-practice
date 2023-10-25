package medium_level;
import java.util.*;
public class sum_of_square_numbers {
public static boolean judgesumsquare( int c) {
	int val=0;

	for(int i=0;i<=c/2;i++) {
		for(int j=0;j<=c/2;j++) {
		val=(i*i)+(j*j);
		}
	}
	
return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(judgesumsquare(n));
	}

}
