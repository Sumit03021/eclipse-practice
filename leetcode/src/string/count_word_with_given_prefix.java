package string;
import java.util.*;
public class count_word_with_given_prefix {
public static int countprefix(String []words,String pref ) {
	int count=0;
	int []counts=new int[words.length];
	for(int j=0;j<words.length;j++) {
	for(int i=0;i<pref.length();i++) {
		if(words[j].length()>=pref.length()) {
			if(words[j].charAt(i)==pref.charAt(i)) {
				counts[j]++;
			}
			if(counts[j]==pref.length()) {
				count++;
			}
		}
	}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []str=new String[n];
for(int i=0;i<n;i++) {
	str[i]=s.next();
}
String pre=s.next();
System.out.println(countprefix(str,pre));
	}

}
