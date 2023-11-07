package string;
import java.util.*;
public class remove_adjacent_duplicate {
public static String removeadjacent(String s) {
	char []arr=s.toCharArray();
	String ans="";
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]==arr[j+1]) {
				arr[j]=0;
				arr[j+1]=0;
			}
		}
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]==0) {
				char temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			ans=ans+arr[i];
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(removeadjacent(str));
	}

}
