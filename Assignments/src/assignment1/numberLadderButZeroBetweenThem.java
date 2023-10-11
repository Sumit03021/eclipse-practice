package assignment1;
import java.util.*;
public class numberLadderButZeroBetweenThem {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==2) {
					System.out.print(i+" ");
				}
				else if(i>=3  && j==1 || j==i)
				System.out.print(i +" ");
				else {
					System.out.print('0' +" "); 
				}
			}
			System.out.println();
		}

	}

}
