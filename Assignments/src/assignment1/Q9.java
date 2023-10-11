package assignment1;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= 4;//s.nextInt();
		//int num=1;
		int nsp=n+1;
		int col=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+" ");
				
			}
			for(int j=1;j<=nsp;j++) {
				System.out.print("  ");
			}
			for(int j=col;j>=1;j--) {
				if(i==n) {
					j=col-1;
					
					
				}
				System.out.print(j);
//			else {
//				System.out.print(i+1-j+" ");
//				}
				
			}
			col++;
			
			nsp-=2;
			System.out.println();
		}
	}

}
