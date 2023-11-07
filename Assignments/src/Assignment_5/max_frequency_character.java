package Assignment_5;
import java.util.*;
public class max_frequency_character {
public static void maxfrequency(String s) {
	int ans=-1;
	int index1=-1;
	int []freq=new int[256];
	for(int i=0;i<s.length();i++) {
		int index=s.charAt(i);
		freq[index]++;
	}
	for( int i=0;i<freq.length;i++) {
			ans=Math.max(freq[i],ans);
	}
	for(int i=0;i<freq.length;i++) {
		if(ans==freq[i]) {
			index1=i;
		}
	}
	for( int i=0;i<s.length();i++) {
		if(index1==s.charAt(i)) {
			System.out.println(s.charAt(i));
			break;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
maxfrequency(str);
	}

}
