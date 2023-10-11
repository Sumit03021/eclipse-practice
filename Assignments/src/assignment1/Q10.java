package assignment1;

public class Q10 {

	public static void main(String[] args) {
		int n=5;
		
		int m=1;
		int nst=2*n-1;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=nst;j++) {
				if( n!=1 && i+j>=7 && j<(2*n-1)/2 +m) {
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
				
				
			}
			 if (i<n) {
				nst-=2;
				m++;
			}
			
			else if(i>n && n!=9 && i>=3 && i<(2*n-1)/2 +3 -m){
				nst+=2;
				
				m--;
			}
			
			 System.out.println();	
			}
			
			
		}
	}


