package Easy_level;
import java.util.*;
public class palindrome_string {
public static String palindrome(String s) {
	int i=0;
	int j=s.length()-1;
	char []arr=new char[s.length()];
	while(i<=j) {
		if(s.charAt(i)<s.charAt(j)) {
		arr[i]=s.charAt(i);
		}else if(s.charAt(i)>s.charAt(j)) {
			arr[i]=s.charAt(j);
		}
		else {
			arr[i]=s.charAt(i);
		}
		i++;
		j--;
	}
	String str="";
	for(int k=0;k<i;k++) {
	  str=str+(char)arr[k];
	}
	if(s.length()%2==0) {
		for(int k=i-1;k>=0;k--) {
			str=str+(char)arr[k];
		}
	}else {
		for(int k=i-2;k>=0;k--) {
			str=str+(char)arr[k];
		}
	}
	return str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(palindrome(str));
	}

}
