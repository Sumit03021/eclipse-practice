package string;
import java.util.*;
public class minimize_string_length {
public static int minimizelength(String s) {
	int []arr=new int[256];
	for(int i=0;i<s.length();i++) {
		int index=s.charAt(i);
		arr[index]++;
	}
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(minimizelength(str));
	}

}
