package assignment2;
import java.util.*;
public class printSeries {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n1=s.nextLong();
		long n2=s.nextLong();
		long i=1;
		long count=n1;
		if(n1==1 ||n1==2 ) {
			while( count>=0){
				if((3*i+2)%n2!=0) {
					System.out.println(3*i+2);
				}
				i++;
				count--;
		}
		}
			else 
		while( count+1>=0){
			if((3*i+2)%n2!=0) {
				System.out.println(3*i+2);
			}
			
			i++;
			count--;
			}
			

	}

}
