package Assignment_5;
import java.util.*;
public class string_toggle_case {
public static void toggle(String s) {
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=65 && s.charAt(i)<=90){
			s1=s1+(char)(s.charAt(i)+32);
		}else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
			s1=s1+(char)((s.charAt(i)+224)%256);
		}
	}
	System.out.println(s1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
toggle(str);
	}

}
