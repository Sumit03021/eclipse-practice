package Lecture_25;

public class leftmost_repeated_index {
public static int leftmostindex(String str) {
	int []arr=new int[256];
	int ans=-1;
	for(int i=0;i<str.length();i++) {
		int index=str.charAt(i);
		arr[index]++;
		if(arr[index]>1) {
			ans=index;
			break;
		}
	}
	for(int i=0;i<str.length();i++) {
		if(ans==str.charAt(i)) {
			ans=i;
			return ans;
		}
	}
	return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdefcfedg";
int ans=leftmostindex(str);
System.out.println(ans);
	}

}
