package Easy_level;
import java.util.*;
public class replace_digit_to_character {
public static String digittocharacter(String s) {
	String ans="";
	int []arr=new int[s.length()];
	for(int i=0;i<s.length();i++) {
		arr[i]=s.charAt(i);
	}
	for(int i=1;i<arr.length;i++) {
		if(i%2==0) {
			arr[i]=arr[i];
			}else {
				arr[i]=arr[i]+arr[i-1]-48;
			}
	}
	for(int i=0;i<arr.length;i++) {
		ans=ans+(char)arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(digittocharacter(str));
	}

}
