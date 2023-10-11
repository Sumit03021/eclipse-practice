package assignment1;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);	
int n=s.nextInt();
int num =1;
int col =1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(num +" ");
		num++;
	}
	System.out.println();
	
	col++;
}
	}

}
