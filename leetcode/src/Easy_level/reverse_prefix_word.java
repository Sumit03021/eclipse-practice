package Easy_level;
import java.util.*;
public class reverse_prefix_word {
public static String reverseprefix(String word, char ch) {
	int ans=0;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)==ch) {
			ans=i;
			break;
		}
	}
	String ans1="";
	for(int i=0;i<=ans;i++) {
		ans1=word.charAt(i)+ans1;
	}
	if(word.length()>ans) {
	for(int i=ans+1;i<word.length();i++) {
		ans1=ans1+word.charAt(i);
	}
	}
	return ans1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
char ch=s.next().charAt(0);
System.out.println(reverseprefix(str,ch));

	}

}
