package Lecture_25;

public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// all primitive datatype are wrapper class as object with address but show value due to override string.
		Integer a=new Integer(123);
		System.out.println(a);
		Integer b=12;
		System.out.println(b);
		int c=13;
	b=c; // (autoboxing)--primitive to wrapper class 
		// b=Integer.valueof(c)
		System.out.println(b);	
		System.out.println(c);
		c=b;//unboxing---wrapper class to primitive
		// c=b.intvalue();
		System.out.println(c);
	}

}
