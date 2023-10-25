package Easy_level;
import java.util.*;
public class max_words_in_sentences {
public static int maxwords(String[] sentences) {
	int []count=new int[sentences.length];
	for(int i=0;i<sentences.length;i++) {
		for(int j=0;j<sentences[i].length();j++) {
		if(sentences[i].charAt(j)=='_') {
			count[i]++;
		}
	}
	}
	int max=Integer.MIN_VALUE;
	for(int i=0;i<count.length;i++) {
		System.out.print(count[i]+" ");
		if(count[i]>max) {
			max=count[i]+1;
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []str;
str=new String[n];
for(int i=0;i<str.length;i++) {
	str[i]=s.next();
}
System.out.println(maxwords(str));
	}

}
