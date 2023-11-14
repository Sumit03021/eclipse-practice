package string;
import java.util.*;
public class equal_halves_alike {
public static boolean alikehalve(String s) {
	String ans1="";
	String ans2="";
	for(int i=0;i<s.length()/2;i++) {
		ans1=ans1+s.charAt(i);
	}
	for(int i=s.length()/2;i<s.length();i++) {
		ans2=ans2+s.charAt(i);
	}
	int count1=0;
	int count2=0;
	for(int i=0;i<ans1.length();i++) {
		if(ans1.charAt(i)=='a'||ans1.charAt(i)=='e'||ans1.charAt(i)=='i'||ans1.charAt(i)=='o'||ans1.charAt(i)=='u'
				||ans1.charAt(i)=='A'||ans1.charAt(i)=='E'||ans1.charAt(i)=='I'||ans1.charAt(i)=='O'||ans1.charAt(i)=='U') {
			count1++;
		}
	}
	for(int i=0;i<ans2.length();i++) {
		if(ans2.charAt(i)=='a'||ans2.charAt(i)=='e'||ans2.charAt(i)=='i'||ans2.charAt(i)=='o'||ans2.charAt(i)=='u'
				||ans2.charAt(i)=='A'||ans2.charAt(i)=='E'||ans2.charAt(i)=='I'||ans2.charAt(i)=='O'||ans2.charAt(i)=='U') {
			count2++;
		}
	}
	if(count1==count2) {
	return true;
}else {
	return false;
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(alikehalve(str));
	}

}
