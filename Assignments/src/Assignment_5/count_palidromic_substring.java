package Assignment_5;
import java.util.*;
public class count_palidromic_substring {
public static void palidromic(String s) {
	String ans="";
	int counts=0;
for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<s.length()+1;j++) {
		ans=s.substring(i,j);
		int count=0;
		int m=0;
		int n=ans.length()-1;
		while(m<n) {
			if(ans.charAt(m)==ans.charAt(n)) {
				count++;
				m++;
				n--;
			}else {
				break;
			}
		}
		if(count==ans.length()/2) {
			counts++;
		}
				}
	}
System.out.println(counts);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
palidromic(str); 
			
}
}