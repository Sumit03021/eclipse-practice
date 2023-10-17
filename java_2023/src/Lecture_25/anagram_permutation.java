package Lecture_25;
import java.util.*;
public class anagram_permutation {
public static void anagram(String str) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// anagram----same permutations;
		// number of character=256---2 power 8.
		String str="abcde";
		String str1="acdeb";
		char []arr1=str1.toCharArray();
		char []arr=str.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++) {
			if(str1.length()!=str.length()) {
				System.out.println("not a anagram");
				break;
			}else if(arr[i]!=arr1[i]) {
				System.out.println("not a anagram");
				break;
			}else {
				System.out.println("it is a anagram");
				break;
			}
		}
	}

}
