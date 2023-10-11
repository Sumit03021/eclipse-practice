package assignment2;
import java.util.*;
public class countRepetionOfDigits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long num=s.nextLong();
		long digit=s.nextLong();
		long i=1;
		long count=0;
		while(num>0) {
			long ld=num%10;
			if(ld==digit) {
				count++;
			}
			num=num/10;
			i++;
		}
		System.out.println(count);

	}

}
