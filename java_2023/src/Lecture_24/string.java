package Lecture_24;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("hello"); // new keywords--- store in heap memory.
String str2="hello"; // string literals----- store in string pool
// constant area (special area/memory of heap)
System.out.println(str); // override to value of string-- new definition
System.out.println(str2); // override to value of string ---new definition
	if(str == str2) {
		System.out.println("same");
	}else {
		System.out.println("not same"); // address comparison.....
	}
	String str3="bye";
	String str4="bye";
	if(str3 == str4) { // address in the same pool.
		System.out.println("same");
	}else {
		System.out.println("not same"); // address comparison.....
	}
	String str5=new String("bye");
	String str6=new String("bye");
	if(str5 == str6) { // different address
		System.out.println("same");
	}else {
		System.out.println("not same"); // address comparison.....
	}
	if(str2 == str4) { // different address pool for different words..
		System.out.println("same");
	}else {
		System.out.println("not same"); // address comparison.....
	}
	str3= str3 +"hello"; // string concation(addition)
	System.out.println(str3);
	// string is constant(immutable) can be updated create new string
	// address in the heap with copy from string pool area.
	System.out.println(str4);
	if(str.equals(str2)) { // create function for check value of string..
		System.out.println("same");
	}else {
		System.out.println("not same"); // address comparison.....
	}
		System.out.println(str2.length()); // length functions
		System.out.println(str2.charAt(4));
		System.out.println(str2.substring(1)); // start from which index..
		System.out.println(str2.substring(1,3)); // end excludes....
		
		//lexical graphical ------dictionary alphabatically
		String str7="afgg";
		String str8="gggggggggg";
		System.out.println(str7.compareTo(str8)); 
		// differnce between sky value of both---(a-g)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
