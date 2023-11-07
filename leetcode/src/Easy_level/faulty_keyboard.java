package Easy_level;
import java.util.*;
public class faulty_keyboard {
public static String result(String s) {
	int ans=0;
	String ans1="";
	int []arr=new int[1];
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==105) {
			arr[0]++;
		}
	}
	for(int j=0;j<arr[0];j++) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==105) {
			ans=i;
			break;
		}
	}
	for(int i=0;i<ans;i++) {
		ans1=s.charAt(i)+ans1;
	}
	if(s.length()>ans) {
	for(int i=ans+1;i<s.length();i++) {
		ans1=ans1+s.charAt(i);
	}
	}
	}
	return ans1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(result(str));
	}

}
