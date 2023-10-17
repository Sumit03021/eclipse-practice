package Lecture_25;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer>arr=new ArrayList<Integer>();
System.out.println(arr);
arr.add(12);
System.out.println(arr);
arr.add(14);
System.out.println(arr);
System.out.println(arr.size());// current size
System.out.println(arr.get(0));// by indexing get value.(0,size-1)
arr.set(0, 45);// update values.(0,size-1)
arr.add(0,23); // insert by .add(0,23) for new values.add(0-size)
System.out.println(arr);
arr.remove(1);
System.out.println(arr);
Collections.sort(arr);
System.out.println(arr);
	}

}
