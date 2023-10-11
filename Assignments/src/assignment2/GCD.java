package assignment2;
import java.util.*;
public class GCD {
	public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int num1 = s.nextInt();
	        int num2 = s.nextInt();
	        
	        int result = gcd(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
	}

}
