package Easy_level;
import java.util.*;
public class capitalize_title {
public static String capitalize(String title) {
	String ans="";
	if(title.charAt(0)<=90 && title.charAt(0)>=65) {
		ans=ans + title.charAt(0);
	}else {
		ans=ans+(char)((title.charAt(0)+224)%256);
	}
	for(int i=1;i<title.length();i++) {
		if(title.charAt(i)<=90 && title.charAt(i)>=65 && title.charAt(i-1)==32) {
			ans=ans+ title.charAt(i);
		}else if(title.charAt(i)<=90 && title.charAt(i)>=65 && title.charAt(i-1)!=32) {
			ans=ans +(char)(title.charAt(i)+32);
		}else if(title.charAt(i)<=122 && title.charAt(i)>=97 && title.charAt(i-1)==32) {
			ans=ans+(char)((title.charAt(i)+224)%256);
		}else {
			ans=ans+title.charAt(i);
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(capitalize(str));
	}

}
