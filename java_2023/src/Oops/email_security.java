package Oops;
class Abc{
	 private String email;
	private String password;
	Abc(String email,String password){
		this.email=email;
		this.password=password;
	}
	static int count;
	public boolean Set(String password,String newemail) {
		if(this.password==password) {
			this.email=newemail;
			return true;
		}else {
			return false;
		}
	}
	public String getemail() {
		return this.email;
	}
	public static void fun1() {
		
	}
	public void fun2() {
		
	}
	public static void get() {
		fun1();
		fun2();
		count=count++;
		// static function can only access static members due to independent of objects based variables.
	}
}
public class email_security {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc obj=new Abc("sumit@123","1234");
System.out.println(obj.getemail());
obj.Set("1234", "vikas@123");
System.out.println(obj.getemail());
	}

}
