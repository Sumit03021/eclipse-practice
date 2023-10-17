package Lecture_25;
import java.util.*;
public class arraylist_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer>arr=new ArrayList<Integer>();
arr.add(12);
arr.add(23);
arr.add(30);
arr.add(40);
System.out.println(arr);
int size=arr.size();
 int i=0;
 int j=size-1;
 while(i<j) {
	 int temp=arr.get(i);
	 arr.set(i,arr.get(j));
	 arr.set(j,temp);
	 i++;
	 j--;
}
 System.out.println(arr);
	}

}
