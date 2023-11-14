package string;
import java.util.*;
public class percentage_of_character {
public static int percentage(String s,char letter) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==letter) {
			count++;
		}
	}
	int ans=(Math.floorDiv(count*100,s.length()));
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
char ch=s.next().charAt(0);
System.out.println(percentage(str,ch));
	}

}
