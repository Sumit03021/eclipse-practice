package assignment1;
import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int n= s.nextInt();
	int m=1;
	if(n<=1) {
		System.out.print("Not Prime");
	}
	for(int i=2;i<n;i++) {
		if(n%i==0){
			System.out.print(" Not Prime ");
		m++;
		break;
		}
		
			
		
		}
	if(m==1)
		System.out.print(" Prime");
	}

}


