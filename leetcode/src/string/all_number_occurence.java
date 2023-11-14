package string;
import java.util.*;
public class all_number_occurence {
public static boolean occurence(String s) {
	int count=1;
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(0)) {
			count++;
		}
	}
	int []arr=new int[26];
	for(int i=0;i<s.length();i++) {
		int index=s.charAt(i);
		arr[index-97]++;
	}
	for(int i=0;i<26;i++) {
		for(int j=0;j<25;j++) {
			if(arr[j]==0) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	int []arr1=new int[(s.length()/count)+1];
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=arr[i];
	}
	for(int i=0;i<arr1.length-1;i++) {
		if(arr1[i]==count ||arr1[arr1.length-1]==0) {
			return true;
		}else {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(occurence(str));
	}

}
