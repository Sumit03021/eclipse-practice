package string;
import java.util.*;
public class odd_string_find {
public static String oddstring(String []words) {
	String ans="";
	int [][]diff=new int[words.length][words[0].length()-1];
	for(int i=0;i<words.length;i++) {
		for(int j=0;j<words[i].length()-1;j++) {
			diff[i][j]=words[i].charAt(j+1)-words[i].charAt(j);
		}
	}
	int[] []arr=new int[1][words[0].length()-1];
	for(int i=0;i<words[0].length()-1;i++) {
		arr[0][i]=diff[0][i];
	}
	for(int i=0;i<words.length-2;i++) {
		for(int j=0;j<words[i].length()-1;j++) {
		if(!Arrays.equals(diff[i],diff[(i+1)])&& Arrays.equals(diff[(i+1)],diff[i+2])) {
			ans=words[i];
		}
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []str=new String[n];
for(int i=0;i<n;i++) {
	str[i]=s.next();
}
System.out.println(oddstring(str));
	}

}
