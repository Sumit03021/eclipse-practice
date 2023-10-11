package assignment2;
import java.util.*;
public class primeNonprime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		if(n%2==0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
