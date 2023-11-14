package string;
import java.util.*;
public class generate_character_odd_times {
public static String generatecharacter(int n) {
	String ans="";
	if(n%2!=0) {
		for(int i=0;i<n;i++) {
			ans=ans+"a";
		}
	}else {
		ans=ans+"a";
		for(int i=1;i<n;i++) {
			ans=ans+"b";
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(generatecharacter(n));
	}

}
