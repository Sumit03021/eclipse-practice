package string;
import java.util.*;
public class DI_string_match {
public static int [] dimatch(String s) {
	int []arr=new int[s.length()+1];
	for(int i=0;i<arr.length;i++) {
		arr[i]=i;
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==68) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
	}
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
int []arr=dimatch(str);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}

	}

}
