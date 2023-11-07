package Easy_level;
import java.util.*;
public class to_lowercase {
public static String lowercase(String s) {
	String ans="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=65 && s.charAt(i)<=90) {
			ans=ans+(char)(s.charAt(i)+32);
		}else {
			ans=ans+s.charAt(i);
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(lowercase(str));
	}

}
