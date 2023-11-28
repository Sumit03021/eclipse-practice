package greedy;
import java.util.*;
public class split_balanced_substring {
public static int balancesubstring(String s) {
	int count=0;
	int count1=0;
	int count2=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==82) {
			count1++;
		}
		if(s.charAt(i)==76) {
			count2++;
		}
		if(count1==count2) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(balancesubstring(str));
	}

}
