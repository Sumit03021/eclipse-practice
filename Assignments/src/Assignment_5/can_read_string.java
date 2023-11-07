package Assignment_5;
import java.util.*;
public class can_read_string {
public static void readstring(String s) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=65 && s.charAt(i)<=90) {
			System.out.println();
		}
		System.out.print(s.charAt(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
readstring(str);
	}

}
