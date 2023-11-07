package string;
import java.util.*;
public class first_palidromic_string {
public static String palidromic(String []words) {
	String ans="";
	for(int i=0;i<words.length;i++) {
		int j=0;
		int k=words[i].length()-1;
		int count=0;
		while(j<k) {
			if(words[i].charAt(j)==words[i].charAt(k)) {
				count++;
				j++;
				k--;
			}else {
				break;
			}
		}
		if(count==words[i].length()/2) {
			ans=words[i];
			break;
		}else {
			ans="";
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []arr=new String[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.next();
}
System.out.println(palidromic(arr));
	}

}
