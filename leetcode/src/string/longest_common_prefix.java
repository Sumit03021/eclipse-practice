package string;
import java.util.*;
public class longest_common_prefix {
//	public static boolean common(String []strs,strs[0])
public static String longestcommon(String []strs) {
	String ans="";
	for(int i=0;i<strs[0].length();i++) {
	char s=strs[0].charAt(i);
	int count=0;
	for(int j=0;j<strs.length;j++) {
		if(strs[j].charAt(i)==s) {
			count++;
		}
		System.out.println(count);
		if(count==strs.length) {
			ans=ans+strs[0].charAt(i);
		}else {
			break;
		}
	}
}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []str=new String[n];
for(int i=0;i<n;i++) {
	str[i]=s.next();
}
System.out.println(longestcommon(str));
	}

}
