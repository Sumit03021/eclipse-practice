package Oops;
import java.util.*;
public class frequency_character {
//this keyword call for only objects address in function or constructor function.
public static pair getchar(String s ,char ch1 ,char ch2) {
	pair obj=new pair(ch1,ch2,0,0);
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch1) {
			obj.f1++;
		}else if(s.charAt(i)==ch2) {
			obj.f2++;
		}
	}
	return obj;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
char ch1=s.next().charAt(0);
char ch2=s.next().charAt(0);
pair obj=getchar(str,ch1,ch2);
System.out.println(obj.f1 +" + "+obj.f2);
	}

}
 
class pair{
char a;
char b;
int f1;
int f2;
pair(char val1,char val2,int val3,int val4){
a=val1;
b=val2;
f1=val3;
f2=val4;
}
}

