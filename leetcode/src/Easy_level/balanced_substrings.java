package Easy_level;
import java.util.*;
public class balanced_substrings {
public static int balancedsubstring(String s) {
	String ans="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length()+1;j++) {
			ans=s.substring(i,j);
			int count1=0;
			int count2=0;
			char []arr=ans.toCharArray();
			for(int k=0;k<arr.length;k++) {
				if(arr[k]==82) {
					count1++;
				}else if(arr[k]==76) {
					count2++;
				}
			}
			if(count1==count2) {
				count++;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(balancedsubstring(str));
	}

}
