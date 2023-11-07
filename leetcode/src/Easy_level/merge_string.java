package Easy_level;
import java.util.*;
public class merge_string {
public static String merge(String word1,String word2) {
	char []arr1=word1.toCharArray();
	char []arr2=word2.toCharArray();
	int n=arr1.length;
	int m=arr2.length;
	String ans="";
	if(m>n) {
		for(int i=0;i<n;i++) {
			ans=ans+(arr1[i])+(arr2[i]);
		}
		for(int i=n;i<m;i++) {
			ans=ans+arr2[i];
		}
	}else if(n>m) {
		for(int i=0;i<m;i++) {
			ans=ans+(arr1[i])+(arr2[i]);
		}
		for(int i=m;i<n;i++) {
			ans=ans+arr1[i];
		}
	}else {
		for(int i=0;i<m;i++) {
			ans=ans+(arr1[i])+(arr2[i]);
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
System.out.println(merge(s1,s2));
	}

}
