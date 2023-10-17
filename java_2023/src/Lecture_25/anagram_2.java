package Lecture_25;

public class anagram_2 {
public static boolean anagram(String str,String str1) {
	int []freq1=new int[256];
	int []freq2=new int[256];
	for( int i=0;i<str.length();i++) {
		int index=str.charAt(i);
		freq1[index]++;
	}
	for( int i=0;i<str1.length();i++) {
		int index=str1.charAt(i);
		freq2[index]++;
	}
	for(int i=0;i<256;i++) {
		if(freq1[i]!=freq2[i]) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcde";
String str1="bcdea";
anagram(str,str1);
	}

}
