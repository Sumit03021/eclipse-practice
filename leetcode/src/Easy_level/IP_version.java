package Easy_level;
import java.util.*;
public class IP_version {
public static String ipversion(String address) {
	char []arr=address.toCharArray();
	String ans="";
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==46) {
		ans=ans+"[.]";
		}else {
			ans=ans+arr[i];
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(ipversion(str));
	}

}
