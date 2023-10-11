package assignment2;
import java.util.*;
public class pascalTriangle {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	
	for(int i=0;i<n;i++) {
		int number=1;
		for(int j=0;j<=i;j++) {
			System.out.print(number +" ");
			number=number*(i-j)/(j+1);
			
		}
		System.out.println();
	}

	}

}
