package Oops;
class A{
	int val1;
	int val2;
	A(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
		// this keyword use as imaginary internal in the arguments of function as a address of reference objects.
	}
	void fun(int val1) {
		this.val1=val1;
	}
}
public class A_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A obj=new A(23,45);
 System.out.println(obj.val1 +" "+obj.val2);
 obj.fun(60);
 System.out.println(obj.val1+" "+obj.val2);
	}

}
