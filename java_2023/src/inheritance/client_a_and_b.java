package inheritance;

public class client_a_and_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj1=new A(); //d(a),d1(a),d2(error)
B obj2=new B();// d,d1,d2 all read--d(b),d1(a),d2(b)
A obj3=new B(); //
System.out.println(obj1.d);
System.out.println(obj1.d1);
//System.out.println(obj1.d2);
	System.out.println(obj2.d);
	System.out.println(obj2.d1);
	System.out.println(obj2.d2);
System.out.println(obj3.d);
System.out.println(obj3.d1);
//System.out.println(obj3.d2); error due to early binding concepts--compiler error w.r.t to reference type of objected variables.
obj3.fun();
}
}