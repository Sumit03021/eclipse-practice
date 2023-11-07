package Assignment_5;
import java.util.*;
public class string_difference_ascii_code {
public static void diffascii(String s) {
	int ans=0;
	for(int i=0;i<s.length()-1;i++) {
		ans=s.charAt(i+1)-s.charAt(i);
		System.out.print(s.charAt(i));
		System.out.print(ans);
	}
	System.out.println(s.charAt(s.length()-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
diffascii(str);
	}

}
