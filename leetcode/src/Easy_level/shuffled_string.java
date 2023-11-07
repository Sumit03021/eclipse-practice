package Easy_level;
import java.util.*;
public class shuffled_string {
public static String shuffle(String s,int []indices) {
	String ans="";
	char []arr=s.toCharArray();
	char []arr1=s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		arr[indices[i]]=arr1[i];
	}
	for(int i=0;i<arr.length;i++) {
		ans=ans+arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
int []arr=new int[str.length()];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
System.out.println(shuffle(str,arr));
	}

}
