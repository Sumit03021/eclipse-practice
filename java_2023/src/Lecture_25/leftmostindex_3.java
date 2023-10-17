package Lecture_25;

public class leftmostindex_3 {
	public static int leftmostindex(String str) {
		int []arr=new int[256];
		int ans=-1;
		for(int i=str.length()-1;i>=0;i--) {
			int index=str.charAt(i);
			arr[index]++;
			if(arr[index]>1) {
				ans=i;
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
