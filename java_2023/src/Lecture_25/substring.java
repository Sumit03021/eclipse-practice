package Lecture_25;
public class substring {
public static void substring(String str) {
  for(int i=0;i<str.length();i++) {
	  for(int j=i+1;j<str.length()+1;j++) {
		  System.out.print(str.substring(i, j)+" ");
	  }
  }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcd";
substring(str);


	}

}
