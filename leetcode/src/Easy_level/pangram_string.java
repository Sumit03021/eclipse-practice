package Easy_level;
import java.util.*;
public class pangram_string {
public static boolean pangram(String sentence) {
	int []arr=new int[256];
	for(int i=0;i<sentence.length();i++) {
			int index=sentence.charAt(i);
			arr[index]++;
	}
	for(int i=97;i<=122;i++) {
		if(arr[i]==0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(pangram(str));
	}

}
