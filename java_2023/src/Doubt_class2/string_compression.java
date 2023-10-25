package Doubt_class2;
import java.util.*;
public class string_compression {
public static int count(char []str,int n) {
	int count=0;
	for(int i=0;i<str.length;i++) {
		if(str[i]==n) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
char []str1=str.toCharArray();
Arrays.sort(str1);
int jump=0;
for(int i=0;i<str1.length;i=i+jump) {
	System.out.print(str1[i]);
	int count=count(str1,str1[i]);
	jump=count;
	if(count>1) {
		System.out.print(count);
	}
}
	}

}
