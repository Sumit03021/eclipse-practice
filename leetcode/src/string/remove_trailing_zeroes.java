package string;
import java.util.*;
public class remove_trailing_zeroes {
public static String removezero(String num) {
	int count=0;
	String ans="";
	for(int i=num.length()-1;i>=0;i--) {
		if(num.charAt(i)==48) {
			count++;
		}else {
			break;
		}
		System.out.println(count);
	}
	for(int i=0;i<num.length()-count;i++) {
		ans=ans+(char)num.charAt(i);
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(removezero(str));
	}

}
