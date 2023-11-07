package string;
import java.util.*;
public class reverse_string_ii {
public static String reverse(String s,int k) {
	String ans="";;
	for(int i=0;i<k;i++) {
		ans=s.charAt(i)+ans;
	}
	for(int i=k;i<s.length();i++) {
		ans=ans+s.charAt(i);
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
int k=s.nextInt();
System.out.println(reverse(str,k));
	}

}
