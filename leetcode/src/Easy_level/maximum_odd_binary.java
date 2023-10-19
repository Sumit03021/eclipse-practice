package Easy_level;
import java.util.*;
public class maximum_odd_binary {
public static String maxoddbinary(String s) {
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i)==1) {
			s.charAt(s.length()-1)=="1";
			break;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(maxoddbinary(str));
	}

}
