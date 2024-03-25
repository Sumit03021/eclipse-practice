package polymorphism;

public class overload {
	//case 1
public static int sum(int a,int b) {
	return a+b;
}
public static double sum(double a,double b) {
	return a+b;
}
// case 2
public static void fun(Integer a) {
	System.out.println("Integer is called");
	
}
public static void fun(int a) {
	
	System.out.println("int is called");
}
// case 3
public static void fun1(String str) {
	System.out.println("string is called");
	
}// priority children references and also typecasting done.
public static void fun1(Object a) {
	
	System.out.println("object is called");
}
// case 4
public static void fun2(String a) {
	
	System.out.println("b");
}
// string buider/string buffer---not immutables.
public static void fun2(StringBuilder a) {
	
	System.out.println("c");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(sum(2,3));
 System.out.println(sum(3.0,5.0));
 System.out.println(sum(3,9.0));
 fun(3);
 fun1("233");
 fun2("abc");// due to using literals.
 
	}

}
