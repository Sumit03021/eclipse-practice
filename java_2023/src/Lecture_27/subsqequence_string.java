package Lecture_27;

public class subsqequence_string {
public static void sub(String ans,String s1,int i) {
   	if(i==ans.length()) {
   		System.out.println(s1);
   		return;
   	}//char ch=ans.charAt(0)
	sub(ans,s1+ans.charAt(i),i+1);//sub(ans.substring(1),ans+ch)
   	sub(ans,s1,i+1);//sub(ans.substring(1),ans+"")
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ans="abc";
String s1="";
sub(ans,s1,0);
	}                                                

}
