package Lecture_25;
import java.util.*;
public class good_string {
public static int goodstring(String str) {
	int ans=0; 
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			count++;
		}else {
			ans=Math.max(ans, count);
			count=0;
		}
	}
	if(count>0) {
		ans=Math.max(ans, count);
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
int ans=goodstring(str);
System.out.println(ans);
	}

}
