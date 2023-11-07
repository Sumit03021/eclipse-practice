package Assignment_5;
import java.util.*;
public class string_odd_even {
	public static void oddevenplace(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0){
				s1=s1+(char)(s.charAt(i)+1);
			}else if(i%2!=0) {
				s1=s1+(char)((s.charAt(i)+255)%256);
			}
		}
		System.out.println(s1);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.next();
	oddevenplace(str);
	

	}

}
