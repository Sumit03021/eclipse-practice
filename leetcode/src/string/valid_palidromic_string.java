package string;

import java.util.Scanner;

public class valid_palidromic_string {
public static boolean palidromic(String s) {
	char []arr=s.toCharArray();
	String ans="";
	int count=0;
	for(int j=0;j<arr.length;j++) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==32) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=(char)temp;
		}
	}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=97 && arr[i]<=122) {
			count++;
		}else if(arr[i]>=65 && arr[i]<=90) {
			count++;
		}
	}
	System.out.println(count);
	int []arr1=new int[s.length()];
	for(int i=0;i<arr.length;i++) {
		if(s.charAt(i)>=97 &&s.charAt(i)<=122) {
			arr1[i]=s.charAt(i);
		}else if(s.charAt(i)>=65 && s.charAt(i)<=90) {
			arr1[i]=s.charAt(i)+32;
		}
	}
	for(int i=0;i<count;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]==0) {
				int temp=arr1[j+1];
				arr1[j+1]=arr1[j];
				arr1[j]=temp;
			}
		}
	}
	for(int i=0;i<count;i++) {
		ans=ans+(char)arr1[i];
	}
//	int k=0;
//	int e=ans.length()-1;
//	int counts=0;
//	while(k<=e) {
//		if(ans.charAt(k)==ans.charAt(e)) {
//			counts++;
//			k++;
//			e--;
//		}
//	}
//	if(counts!=ans.length()/2) {
//		return false;
//	}else {
//		return true;
//	}
	return true;
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(palidromic(str));
	}

}

