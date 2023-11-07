package Assignment_5;

import java.util.Scanner;

public class palidromic_string {
	public static void palodromic(String str) {
		int i=0;
		int j=str.length()-1;
	 int count=0;
	 while(i<j) {
		 if(str.charAt(i)==str.charAt(j)) {
			 count++;
			 i++;
			 j--;
		 }else {
			 break;
		 }
	 }
		 if(count == str.length()/2) { 
			 System.out.println("yes");
		 }else {
			 System.out.println("no");
		 }
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
	  String str=s.next();
	  palodromic(str);

	}

}
