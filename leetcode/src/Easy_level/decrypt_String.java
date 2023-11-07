package Easy_level;
import java.util.*;
public class decrypt_String {
public static String decryptalpha(String s) {
	int count=0;
	String ans="";
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==35) {
			count++;
		}
	}
	char []arr=s.toCharArray();
	int []arr1=new int[arr.length];
	if(arr[2]==35) {
		arr1[0]=arr[0];
		arr1[1]=arr[1];
	}else if(arr[3]==35) {
		arr1[0]=arr[0]+48;
		arr1[1]=arr[1];
	}else if(arr[4]==35) {
		arr1[0]=arr[0]+48;
		arr1[1]=arr[1]+48;
	}else {
		arr1[0]=arr[0]+48;
		arr1[1]=arr[1]+48;
	}
	for(int i=2;i<arr.length;i++) {
		if(arr[i]==35) {
			if(arr[i-2]==50) {
			arr1[i]=(arr[i-2]+arr[i-1]+18);
			arr1[i-2]=0;
			arr1[i-1]=0;
			}else if(arr[i-2]==49) {
				arr1[i]=(arr[i-2]+arr[i-1]+9);
				arr1[i-2]=0;
				arr1[i-1]=0;
			}
		}else {
			arr1[i]=arr[i]+48;
		}
	}
	for(int j=0;j<2*count;j++) {
	for(int i=0;i<arr1.length-1;i++) {
		if(arr1[i]==0) {
			int temp=arr1[i+1];
			arr1[i+1]=arr1[i];
			arr1[i]=temp;
		}
	}
	}
	for(int i=0;i<arr1.length-2*count;i++) {
		ans=ans+(char)arr1[i];
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(decryptalpha(str));
	}

}
