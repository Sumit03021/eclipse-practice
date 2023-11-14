package string;
import java.util.*;
public class ransom_note {
public static boolean ransom(String ransomNote,String magazine) {
	for(int i=0;i<ransomNote.length();i++) {
		for(int j=0;j<magazine.length();j++) {
			if(ransomNote.charAt(i)!=magazine.charAt(j)) {
				return false;
			}
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
System.out.println(ransom(str1,str2));
	}

}
