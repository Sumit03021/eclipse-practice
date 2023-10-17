package Lecture_25;
// iteration from right side to get leftmost repeated char.
public class leftmostindex_2 {
public static int leftmostindex(String str) {
	int []arr=new int[256];
	for(int i=0;i<str.length();i++) {
		int index=str.charAt(i);
		arr[index]++;
	}
	int ans=-1;
	for(int i=0;i<str.length();i++) {
		int index=str.charAt(i);
		if(arr[index]>1) {
			ans=i;
			return ans;
		}
	}
	return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcddef";
int ans=leftmostindex(str);
System.out.println(ans);
	}

}
